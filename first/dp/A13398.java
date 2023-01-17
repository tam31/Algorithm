package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A13398 {

	public static void main(String[] args) throws IOException {
		int[][] dp = new int[2][100001];
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//수를 안 뺏을때 0, 하나의 수를 뺼때 1
		int max=dp[0][0] = dp[1][0] = arr[0];
		
		for(int i=1; i<n; i++) {
			dp[0][i] = Math.max(dp[0][i-1]+arr[i], arr[i]);
			dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1]+arr[i]);
			max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
		}
		
		System.out.println(max);
		
	}

}
