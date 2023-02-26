package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A27_11057 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[n][10];
		for(int i=0; i<10; i++) {
			dp[0][i] = 1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<10; j++) {
				for(int k=j; k<10; k++) {
					dp[i][j] += dp[i-1][k]%10007;
				}
				dp[i][j] %= 10007;
			}
		}
		
		long sum = 0;
		for(int i=0; i<10; i++) {
			sum += dp[n-1][i];
			}
		System.out.println(sum%10007);
		
	}

}
