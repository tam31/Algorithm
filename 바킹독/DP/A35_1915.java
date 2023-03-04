package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A35_1915 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int max = 0;
		int[][] dp = new int[n][m];
		
		char[][] arr = new char[n][m];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
			for(int j=0; j<m; j++) {
				dp[i][j] = arr[i][j]-'0';
				if(dp[i][j] == 1 && max == 0) max =1;
			}
		}
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				if(dp[i][j] !=0) {
					dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
					max = Math.max(dp[i][j], max);
				}
			}
		}
		
		System.out.println(max*max);
		
		
	}

}
