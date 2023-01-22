package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15988 {
	public static final int MOD = 1_000_000_009;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[1000001];
		
		dp[1]=1; dp[2]=2; dp[3]=4;
		for(int i=4; i<=1000000; i++) {
			dp[i] = (dp[i-3]+dp[i-2]+dp[i-1])%MOD;
		}
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(dp[num]+"\n");
		}
		
		System.out.println(sb);
		

	}

}
