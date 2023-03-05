package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A38_2011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int n = str.length();
		int[] dp = new int[n+1];
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = str.charAt(i-1)-'0';
		}
		dp[0] = 1;
		for(int i=1; i<=n; i++) {
			if(arr[i] >0) {
				dp[i] = (dp[i]+dp[i-1])%1000000;
			}
			int num = arr[i-1] * 10 + arr[i];
			if(num>=10&&num<=26) {
				dp[i] = (dp[i]+dp[i-2])%1000000;
			}
		}
		System.out.println(dp[n]);
		
//		if(str.charAt(0)=='0') {
//			System.out.println(0);
//			return;
//		}
//		
//		long[] dp = new long[str.length()+1];
//		dp[0] = 1;
//		dp[1] =1;
//		for(int i=2; i<=str.length(); i++) {
//			if(str.charAt(i-1)=='0') {
//				if(str.charAt(i-2)=='1'||str.charAt(i-2)=='2') {
//					dp[i]=dp[i-2]%1000000;
//				}
//				else {
//					break;
//				}
//			}
//			else {
//				int num = Integer.parseInt(str.substring(i-2, i));
//				if(num>9&&num<27) {
//					dp[i] = (dp[i-1]+dp[i-2]) % 1000000;
//				}else {
//					dp[i] = dp[i-1]%1000000;
//				}
//			}
//		}
//		
//		System.out.println(dp[str.length()]);
	
		
	}

}
