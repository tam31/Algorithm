package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A05_11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		long[] dp = new long[n];
		dp[0] = arr[0];
		long sum = arr[0];
		for(int i=1; i<n; i++) {
			dp[i] = dp[i-1]+arr[i];
			sum += dp[i];
		}
		
		System.out.println(sum);
		
		
	}

}
