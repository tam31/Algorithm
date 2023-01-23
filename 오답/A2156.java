package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[n+1];
		dp[1]=arr[1]; 
		for(int i=2; i<=n; i++) {
			if(i<3) {
				dp[2]=arr[1]+arr[2];
			}else {
				dp[i] = Math.max(arr[i]+dp[i-2], arr[i]+arr[i-1]+dp[i-3]);
				dp[i] = Math.max(dp[i], dp[i-1]);
			}
			
		}
		System.out.println(dp[n]);
	}

}
