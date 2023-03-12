package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int n = str.length();
		int[] arr = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = str.charAt(i-1)-'0';
		}
		
		int[] dp= new int[n+1];
		dp[0] = 1;
		for(int i=1; i<=n; i++) {
			if(arr[i] > 0) {
				dp[i] = (dp[i-1]+dp[i])%1000000;
			}
			int num = arr[i-1]*10+arr[i];
			
			if(num>9&&num<27) {
				
				dp[i] = (dp[i]+dp[i-2])%1000000;
			}
		}
		
		System.out.println(dp[n]);
	}

}
