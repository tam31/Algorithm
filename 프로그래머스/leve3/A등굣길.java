package leve3;
import java.util.*;
public class A등굣길 {
	static final int mod = 1000000007;
	public static void main(String[] args) {
		int n = 3;
		int m = 4;
		int[][] puddles = {{2,2}};
		
		int[][] dp = new int[n+1][m+1];
		for(int[] tmp:puddles) {
			dp[tmp[1]][tmp[0]] = -1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==1 && j==1) {
					dp[i][j] = 1;
				}else if(dp[i][j] == -1) {
					continue;
				}else {
					int x = dp[i-1][j] == -1 ? 0:dp[i-1][j];
					int y = dp[i][j-1] == -1 ? 0:dp[i][j-1];
					dp[i][j] = (x+y)%mod;
				}
			}
		}

		
		System.out.println(dp[n][m]);
	}

}
