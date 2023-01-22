package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1699 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		dp[1]=1;
		for(int i=2; i<=n; i++) {
			dp[i] = i;
			for(int j=1; j*j<=i; j++) {
				dp[i] = Math.min(dp[i-j*j]+1, dp[i]);
			}
		}
		
		System.out.println(dp[n]);
		

	}

}
