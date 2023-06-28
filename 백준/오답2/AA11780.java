package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class AA11780 {
	static int INF = 987654321;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[][] map = new int[n+1][n+1];
		int[][] vis = new int[n+1][n+1];
		
		for(int i=0; i<=n; i++) {
			Arrays.fill(map[i], INF);
		}
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			map[a][b] = Math.min(map[a][b], c);
			vis[a][b] = b;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j] > map[i][k]+map[k][j]) {
						map[i][j] = map[i][k]+map[k][j];
						vis[i][j] = vis[i][k];
					}	
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || map[i][j] ==INF) {
					map[i][j] = 0;
					vis[i][j] = 0;
				}
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				List<Integer> list = new ArrayList<>();
				if(vis[i][j] !=0) {
					list.add(i);
					int a = vis[i][j];
					list.add(a);
					while(true) {
												
						
						if(a==j) {
							break;
						}
						a= vis[a][j];
						list.add(a);
					}
				}
				sb.append(list.size()+" ");
				for(int k=0; k<list.size(); k++) {
					sb.append(list.get(k)+" ");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}

}
