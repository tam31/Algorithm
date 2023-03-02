package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A34_9084 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		for(int z=0; z<k; z++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] coin = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				coin[i] = Integer.parseInt(st.nextToken());
			}
			
			int m = Integer.parseInt(br.readLine());
			
			int[] dp = new int[m+1];
			dp[0] = 1;
			for(int i=0; i<n; i++) {
				for(int j=coin[i]; j<=m; j++) {
					dp[j] += dp[j-coin[i]];
				}
			}
			
			System.out.println(dp[m]);
		}
	}

}
