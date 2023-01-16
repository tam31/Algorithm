package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11055 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = arr[i];
		}
		
		int max = 0; //최대값
		//증가하는 부분을 arr[i]로 더해줘서 최댓값 비교
		//현재 d[i]의 값과 arr[i]+d[j]값 비교
		for(int i =0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+arr[i]);
				}
			}
			max = Math.max(max, dp[i]);
		}
		//출력
		System.out.println(max);

	}

}
