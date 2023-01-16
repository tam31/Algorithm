package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A9465 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		for(int nums = 0; nums<num; nums++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[2][n+1];
			int[][] dp = new int[2][n+1];
			
			for(int i=0; i<2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=1; j<=n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			dp[0][0] = dp[1][0] = 0;
			dp[0][1] = arr[0][1]; dp[1][1] = arr[1][1];
			
			for(int i=2; i<=n; i++) {
				dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2])+arr[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2])+arr[1][i];
			}
			
			int ans = Integer.MIN_VALUE;
			for(int i =0; i<2; i++) {
				for(int j = 0; j<=n; j++) {
					ans = Math.max(ans, dp[i][j]);
				}
			}
			sb.append(ans+"\n");
		}
		
		System.out.println(sb);
	}

}
