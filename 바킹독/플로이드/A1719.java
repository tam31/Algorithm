package 플로이드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1719 {
	static final int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n+1][n+1];
		int[][] route = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			Arrays.fill(map[i], INF);
			map[i][i] = 0;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(map[a][b]>c) {
				map[a][b] = c;
				map[b][a] = c;
				route[a][b] = b;
				route[b][a] = a;
			}
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j]>(map[i][k]+map[k][j])) {
						map[i][j] = map[i][k]+map[k][j];
						map[j][i] = map[i][k]+map[k][j];
						route[i][j] = route[i][k];
						route[j][i] = route[j][k];
					}
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(route[i][j] == 0) {
					System.out.print("-"+" ");
				}else {
					System.out.print(route[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
