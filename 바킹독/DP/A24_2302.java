package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A24_2302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[41];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2; i<41; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		int tmp = 0;
		int ans = 1;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			ans *= dp[num-tmp-1];
			tmp = num;
		}
		
		ans *= dp[m-tmp];
		System.out.println(ans);
	}

}
