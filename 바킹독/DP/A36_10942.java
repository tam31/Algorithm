package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A36_10942 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n+1];
		int[][] dp = new int[n+1][n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i=1; i<=n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			dp[i][i] = 1;
//			
//			if(i!=1 && arr[i-1] == arr[i]) {
//				dp[i-1][i] = 1;
//			}
//		}
//		
//		for(int i=2; i<=n-1; i++) {
//			for(int j=1; i+j<=n; j++) {
//				if(arr[j] == arr[i+j] && dp[j+1][i+j-1]==1) {
//					dp[j][i+j] = 1;
//				}
//			}
//		}
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i][i] = 1;
			
			if(i!=1 && arr[i-1] == arr[i]) {
				dp[i-1][i] = 1;
			}
		}
		
		for(int i=2; i<=n ;i++) {
			for(int j=1; j+i<=n; j++) {
				if(arr[j] == arr[i+j] && dp[j+1][j+i-1]==1) {
					dp[j][i+j] = 1;
				}
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			sb.append(dp[s][e]+"\n");
		}
		
		System.out.println(sb);
		
		
	}
}


