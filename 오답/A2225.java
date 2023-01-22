package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2225 {
	public static final int MOD = 1_000_000_000;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		//2차원 dp 배열으로 계산 dp[i-1][j] + dp[i][j-1]
		long[][] dp = new long[k+1][n+1];
		for(int i=0; i<=n; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=k; i++) {
			dp[i][0] = 1;
			for(int j=1; j<=n; j++) {
				dp[i][j] = (dp[i-1][j]+dp[i][j-1])%MOD;
			}
		}
		//출력
		System.out.println(dp[k][n]);
	}

}
