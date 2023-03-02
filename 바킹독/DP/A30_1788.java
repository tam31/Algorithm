package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A30_1788 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 2000001;
		
		long[] dp = new long[num];
		dp[num/2] = 0;
		dp[num/2+1] = 1;
		for(int i=num/2+2; i<num; i++) {
			dp[i] = (dp[i-1]+dp[i-2])%1000000000;
		}
		dp[num/2-1] = 1;
		for(int i=num/2-2; i>-1; i--) {
			dp[i] = (dp[i+2]-dp[i+1])%1000000000;
		}
		if(dp[n+(num/2)]>0) {
			System.out.println(1);
		}else if(dp[n+(num/2)]==0) {
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
		System.out.println(Math.abs(dp[n+(num/2)]));
	}

}
