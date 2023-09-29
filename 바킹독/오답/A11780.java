package 플로이드.오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11780 {
	static final int INF = 987654321;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] map = new int[n+1][n+1];
		int[][] route = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			Arrays.fill(map[i], INF);
			map[i][i] = 0;
		}
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(map[a][b]>c) {
				map[a][b] = c;
				route[a][b] = b;
			}
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j] > (map[i][k]+map[k][j])) {
						map[i][j] =map[i][k]+map[k][j];
						route[i][j] = route[i][k];
					}
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j] == INF) {
					System.out.print(0+" ");
				}else {
					System.out.print(map[i][j]+" ");
				}
			}
			System.out.println();
		}
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(route[i][j] == 0) {
					System.out.println(0);
				}else {
					int cnt = 1;
					int now = i;
					while(route[now][j] !=0) {
						cnt +=1;
						now = route[now][j];
					}
					
					System.out.print(cnt+" ");
					now = i;
					System.out.print(now+" ");
					while(route[now][j] !=0) {
						now = route[now][j];
						System.out.print(now+" ");
					}
					
					System.out.println();
				}
			}
		}
	}

}
