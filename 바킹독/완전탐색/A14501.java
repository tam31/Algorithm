package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] days = new int[n];
		int[] mon = new int[n];
		for(int i=0; i<n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			days[i] = Integer.parseInt(st.nextToken());
			mon[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[n+1];
		
		for(int i=n-1; i>=0; i--) {
			if(days[i] +i <=n) {
				dp[i] = Math.max(mon[i]+dp[i+days[i]],dp[i+1]);
			}else {
				dp[i] = dp[i+1];
			}
		}
		
		System.out.println(dp[0]);
		
	}

}
