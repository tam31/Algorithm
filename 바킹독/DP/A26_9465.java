package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A26_9465 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		for(int num = 0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[2][n];
			for(int i=0; i<2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0; j<n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int[][] dp = new int[2][n];
			dp[0][0] = arr[0][0];
			dp[1][0] = arr[1][0];
			for(int i=1; i<n; i++) {
				if(i==1) {
					dp[0][1] = arr[1][0]+arr[0][1];
					dp[1][1] = arr[1][1] + arr[0][0];
				}else {
					dp[0][i] = arr[0][i]+ Math.max(dp[1][i-1], Math.max(dp[1][i-2], dp[0][i-2]));
					dp[1][i] = arr[1][i] + Math.max(dp[0][i-1], Math.max(dp[1][i-2], dp[0][i-2]));
				}
			}
			System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
		}
	}

}
