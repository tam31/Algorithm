package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A13398 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//배열넣기
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//2차원dp만들기
		int[][] dp = new int[2][n];
		
		//1.수를 제거하지 않을 경우
		long max = arr[0];
		dp[0][0] = arr[0]; dp[1][0] = arr[0];
		for(int i=1; i<n; i++) {
			dp[0][i] = Math.max(dp[0][i-1]+arr[i], arr[i]);
			max =Math.max(dp[0][i], max);
		}
		
		//2.수를 제거할경우
		
		for(int i=1; i<n; i++) {
			dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1]+arr[i]);
			max = Math.max(dp[1][i], max);
		}
		
		//출력
		System.out.println(max);
//		System.out.println(Arrays.deepToString(dp));
	}

}
