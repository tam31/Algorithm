package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		//배열만들기
		int[] dp = new int[n];
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			dp[i] = 1;
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//계산
		for(int i=0; i<n; i++) {
			//처음부터 arr[i] 값이 비교하며 최댓값 설정 
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
	}
}
