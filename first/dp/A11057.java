package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A11057 {
	public static int MOD = 10007;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][10];
		
		//한자리 일때
		for(int i =0; i<10; i++) {
			dp[1][i] = 1;
		}
		//n자리 일때
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= MOD;
				}
			}
		}
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += dp[n][i];
		}
		System.out.println(sum%MOD);
//		System.out.println(Arrays.toString(dp[2]));
	}

}
