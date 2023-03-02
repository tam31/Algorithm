package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A28_2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int coin[] = new int[n];
		int dp[] = new int[m+1];
		
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		for(int i=0; i<n; i++) {
			for(int j=1; j<=m; j++) {
				if(j>=coin[i]) {
					dp[j] += dp[j-coin[i]];
				}
			}
			
		}
		
		System.out.println(dp[m]);
	}

}
