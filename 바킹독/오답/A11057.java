package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11057 {
	public static final int MOD = 10007;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n][10];
		
		for(int i=0; i<10; i++) {
			dp[0][i] = 1;
		}
		
		for(int i=1; i<n; i++) {
			dp[i][0] = 1;
			for(int j=1; j<10; j++) {
				dp[i][j] = (dp[i-1][j]+dp[i][j-1])%MOD;
			}
		}
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += dp[n-1][i];
		}
		System.out.println(sum);

	}

}
