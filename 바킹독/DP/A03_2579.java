package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A03_2579 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[n];
		dp[0] = arr[0];
		
		
		for(int i=1; i<n; i++) {
			if(i==1) {
				dp[1] = arr[1]+arr[0];
			}else if(i==2) {
				dp[2] = Math.max(arr[1]+arr[2], dp[0]+arr[2]);
			}else {
				dp[i] = Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]);
			}
			
			
			
		}
//		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n-1]);
	}

}
