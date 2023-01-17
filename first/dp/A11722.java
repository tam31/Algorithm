package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11722 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}

}
