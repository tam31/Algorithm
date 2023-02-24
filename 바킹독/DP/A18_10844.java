package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A18_10844 {
	static int MOD = 1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n][10];
		
		for(int i=1; i<10; i++) {
			dp[0][i] = 1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][j+1]%MOD;
				}else if(j==9) {
					dp[i][j] = dp[i-1][j-1]%MOD;
				}else {
					dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%MOD;
				}
			}
		}
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum +=dp[n-1][i];
		}
		System.out.println(sum%MOD);
		System.out.println(Arrays.deepToString(dp));
	}

}
