package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1915 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][m];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int max = 0;
		int[][] dp = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				dp[i][j] = arr[i][j]-'0';
				max = Math.max(max, dp[i][j]);
			}
		}
		
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				if(dp[i][j] == 1) {
					dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]))+dp[i][j];
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		System.out.println(max*max);
		
	}

}
