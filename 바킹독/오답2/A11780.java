package 플로이드.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11780 {
	static int INF = 987654321;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] map = new int[n+1][n+1];
		int[][] list = new int[n+1][n+1];
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
				list[a][b] = b;
			}
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j]> map[i][k]+map[k][j]) {
						map[i][j] = map[i][k]+map[k][j];
						list[i][j] = list[i][k];
					}
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j]==INF) {
					System.out.print(0+" ");
				}else {
					System.out.print(map[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int now = list[i][j];
				if(now == 0) {
					System.out.println(0);
				}else {
					int cnt =1;
					while(now !=0) {
						now = list[now][j];
						cnt +=1;
					}
					System.out.print(cnt+" "+i+" ");
					
					now = list[i][j];
					while(now !=0) {
						System.out.print(now+" ");
						now = list[now][j];
					}
					System.out.println();
				}				
			}
		}
	}

}
