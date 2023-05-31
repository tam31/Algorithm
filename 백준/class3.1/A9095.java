package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9095 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		dp[1]=1;
		dp[2]=2;
		dp[3]= 4;
		for(int i =4; i<12; i++) {
			dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			System.out.println(dp[a]);
		}
		
	}

}
