package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1309 {
	public static final int MOD = 9901;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n+1][3];
		dp[1][0] = 1; dp[1][1]=1; dp[1][2] =1;
		for(int i=2; i<=n; i++) {
			dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%MOD;
			dp[i][1] = (dp[i-1][0]+dp[i-1][2]) %MOD;
			dp[i][2] = (dp[i-1][0]+dp[i-1][1]) %MOD;
		}
		
		System.out.println((dp[n][0]+dp[n][1]+dp[n][2])%MOD);
		
	}

}
