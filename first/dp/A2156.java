package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A2156 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		for(int i = 1; i<=n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//2이하는 max(arr[i-2],arr[i-1])+arr[i] //3안되는 이유는 dp[i-1]도 비교해야하기 때문
		//4부터는 dp[i-3]+arr[i-1]+arr[i] vs dp[i-2]+arr[i]
		//하지만 해당 포두주를 선택하지 않을 경우도 잇기때문에 dp[i-1] vs dp[i]
		int[] dp = new int[n+1];
		dp[1] = arr[1];
		for(int i=2; i<=n;i++) {
			if(i<=2) {
				dp[i] = Math.max(arr[i-2], arr[i-1])+arr[i];
			}else {
				dp[i] = Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]);
				dp[i] = Math.max(dp[i], dp[i-1]);
			}
		}
		
		System.out.println(dp[n]);
	}

}
