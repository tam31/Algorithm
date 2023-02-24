package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A16_14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] day = new int[n];
		int[] mon = new int[n];
		int[] dp = new int[n+1];
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			day[i] = Integer.parseInt(st.nextToken());
			mon[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			if(i+day[i] <= n) {
				dp[i+day[i]] = Math.max(dp[i+day[i]], dp[i]+mon[i]);
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n]);
	}

}
