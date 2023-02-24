package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A09_1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+1][n+1];
		int[][] dp = new int[n+1][n+1];
		
		for(int i=1; i<n+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = arr[1][0];
		dp[1][0] = arr[1][0];
		for(int i=2; i<n+1; i++) {
			for(int j=0; j<i; j++) {
				if(j == 0) {
					dp[i][j] = dp[i-1][j]+arr[i][j];
				}else if(j==i-1) {
					dp[i][j] = dp[i-1][j-1]+arr[i][j];
				}else {
					dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+arr[i][j];
				}
				max = Math.max(dp[i][j], max);
			}
		}
		System.out.println(max);
	}

}
