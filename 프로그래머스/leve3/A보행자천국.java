package leve3;
import java.util.*;
public class A보행자천국 {
	static final int MOD = 20170805;
	public static void main(String[] args) {
		int m = 3;
		int n = 6;
		int[][] city_map ={{0, 2, 0, 0, 0, 2}, {0, 0, 2, 0, 1, 0}, {1, 0, 0, 2, 2, 0}}; 
			//{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		
		int[][][] vis = new int[m+1][n+1][2];
		vis[1][1][0] = 1; 
		vis[1][1][1] = 1;
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(city_map[i-1][j-1] == 0) {
					vis[i][j][0] += (vis[i][j-1][0]+vis[i-1][j][1]) % MOD;
					vis[i][j][1] += (vis[i][j-1][0]+vis[i-1][j][1]) % MOD;
				}else if(city_map[i-1][j-1] ==1) {
					continue;
				}else {
					vis[i][j][0] = vis[i][j-1][0];
					vis[i][j][1] = vis[i-1][j][1];
				}
			}
		}
		System.out.println(vis[m][n][0]);
	}

}
