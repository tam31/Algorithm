package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
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
