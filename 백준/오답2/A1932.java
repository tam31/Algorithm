package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int map[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<=i; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[n][n];
		dp[0][0] = map[0][0];
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<=i; j++) {
				dp[i+1][j] = Math.max(dp[i+1][j], map[i+1][j]+dp[i][j]);
				dp[i+1][j+1] = Math.max(dp[i+1][j+1], map[i+1][j+1]+dp[i][j]);
			}
		}
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans = Math.max(ans, dp[n-1][i]);
		}
		System.out.println(ans);
	}

}
