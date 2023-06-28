package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class AA14938 {
	static int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] vis = new int[n+1];
		int[][] map = new int[n+1][n+1];
		for(int i=0; i<=n; i++) {
			Arrays.fill(map[i], INF);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			vis[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(c<=k) {
				map[a][b] = c;
				map[b][a] = c;
			}
		}
		
		for(int t=1; t<=n; t++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					int tmp = map[i][t]+map[t][j];
					if(tmp<=k && map[i][j] > tmp) {
						map[i][j] = tmp;
					}
				}
			}
		}
		
		int max = 0;
		for(int i=1; i<=n; i++) {
			int sum = vis[i];
			for(int j=1; j<=n; j++) {
				if(i==j || map[i][j] == INF) {
					map[i][j] = 0;
				}
				if(map[i][j] != 0) {
					sum += vis[j];
				}
			}
			max = Math.max(sum, max);
		}
		System.out.println(max);
	}

}
