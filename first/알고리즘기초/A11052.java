package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11052 {

	public static void main(String[] args) throws IOException {
		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		
		//dp로 i번쨰와 n-1-i의 합을 구해 최댓값 비교하기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
			for(int j =0; j<i; j++) {
				dp[i] = Math.max(dp[i], dp[i-1-j]+dp[j]);
			}
		}
		//출력
		System.out.println(dp[n-1]);

	}

}
