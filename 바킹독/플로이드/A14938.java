package 플로이드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A14938 {
	static final int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int[] vis = new int[n+1];
		int[][] map = new int[n+1][n+1];
		int[][] route = new int[n+1][n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			vis[i] = Integer.parseInt(st.nextToken());
			Arrays.fill(map[i], INF);
			map[i][i] = 0;
		}
		
		
		for(int i=0; i<r; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			map[x][y] = k;
			map[y][x] = k;
		}
		
		int ans = 0;
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j] > (map[i][k]+map[k][j])) {
						map[i][j] = map[i][k]+map[k][j];
					}
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=1; j<=n; j++) {
				if(map[i][j] <=m) {
					sum += vis[j];
				}
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}

}
