package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A23_15988 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] dp = new long[1000001];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4; i<1000001; i++) {
			dp[i] = (dp[i-3]+dp[i-2]+dp[i-1])%1000000009;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(dp[Integer.parseInt(br.readLine())]);
		}
	}

}
