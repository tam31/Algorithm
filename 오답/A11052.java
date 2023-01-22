package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11052 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//dp dp[i-j-1]+dp[j], dp[i] 비교
		int[] dp= new int[n];
		for(int i=0; i<n; i++) {
			dp[i] = arr[i];
			for(int j=0; j<i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j-1]+dp[j]);
			}
		}
		
		System.out.println(dp[n-1]);
		
		
	}

}
