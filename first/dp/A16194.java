package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A16194 {

	public static void main(String[] args) throws IOException {
		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		//dp로 n-1-j번째와 j번째의 합과 i번쨰와 비교하여 최솟값들을 누적시킨다 
		for(int i=0; i<n; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
			for(int j=0; j<i; j++) {
				dp[i] = Math.min(dp[i], dp[i-1-j]+dp[j]);
			}
		}
		//출력
		System.out.println(dp[n-1]);
	}

}
