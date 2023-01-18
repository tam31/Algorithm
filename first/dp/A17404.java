package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A17404 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		int[][] dp = new int[n][3];
		int ans = Integer.MAX_VALUE;
		for(int k=0; k<3; k++) {
			
			for(int i=0; i<3; i++) {
				if(i==k) dp[0][i] = arr[0][i];
				else dp[0][i] = 1001;
			}
			
			for(int i=1; i<n; i++) {
				dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+ arr[i][0];
				dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2])+ arr[i][1];
				dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1])+ arr[i][2];
			}
			
			for(int i=0; i<3; i++) {
				if(i!=k) {
					ans = Math.min(ans, dp[n-1][i]);
				}
			}
		}
		System.out.println(ans);
	}

}
