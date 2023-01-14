package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A10844 {
	public static int MOD = 1_000_000_000;
	public static void main(String[] args) throws IOException {
		long[][] dp = new long[100][10];
		//처음은 0빼고 다 1
		for(int i = 1; i<10; i++) {
			dp[0][i] = 1;
		}
		//0,9 빼고는 뒷자리수에서 -1, +1 있는 수들을 쓸 수 있음
		for(int i=1; i<100; i++) {
			dp[i][0] = dp[i-1][1] % MOD;
			dp[i][9] = dp[i-1][8] % MOD;
			for(int j=1; j<9; j++) {
				dp[i][j]= (dp[i-1][j-1]+dp[i-1][j+1])%MOD;
			}
		}
		
		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		for(int i=0; i<10 ; i++) {
			sum += dp[n-1][i];
		}
		System.out.println(sum%MOD);
	}

}
