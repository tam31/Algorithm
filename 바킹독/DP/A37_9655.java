package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A37_9655 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 0;
		dp[3] = 1;
		for(int i=4; i<=1000; i++) {
			if(dp[i-1] == 0&& dp[i-3] == 0) {
				dp[i] =1;
			}
		}
		if(dp[n] == 1) {
			System.out.println("SK");
		}else {
			System.out.println("CY");
		}
	}

}
