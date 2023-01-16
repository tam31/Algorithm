package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2225 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] dp = new int[k+1][n+1];
		
		//한가지만 선택할때는 다 1
		for(int i = 0; i<=n; i++) {
			dp[1][i] = 1;
		}
		
		//d[i-1][j] + d[i][j-1]
		for(int i=2; i<=k; i++) {
			dp[i][0] = 1;
			for(int j = 1; j<=n; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1]; 
			}
		}
		
		System.out.println(dp[k][n]);

	}

}
