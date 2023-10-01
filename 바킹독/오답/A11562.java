package 플로이드.오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11562 {
	static final int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] route = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			Arrays.fill(route[i], INF);
			route[i][i] = 0;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(c==0) {
				route[a][b] = 0;
				route[b][a] = 1;
			}else {
				route[a][b] = 0;
				route[b][a] = 0;
			}
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(route[i][j] > route[i][k]+route[k][j]) {
						route[i][j] = route[i][k]+route[k][j];
					}
				}
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(route[a][b]);
		}
	}

}
