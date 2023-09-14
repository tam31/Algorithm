package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A2156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[][] dp = new int[n][3];
		dp[0][1] = arr[0];
		if(n==1) {
			System.out.println(arr[0]);
			return;
		}else {
	
			dp[1][0] = arr[0];
			dp[1][1] = arr[1];
			dp[1][2] = arr[0]+arr[1];
			for(int i=2; i<n; i++) {
				dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
				dp[i][1] = Math.max(dp[i-1][0], dp[i-2][2])+arr[i];
				dp[i][2] = dp[i-1][1]+arr[i];
			}
			int ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
			System.out.println(ans);
		}
	}
}
