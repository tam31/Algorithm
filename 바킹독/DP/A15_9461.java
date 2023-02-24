package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A15_9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 
		 long[] dp = new long[101];
		 dp[1]=1;
		 dp[2]=1;
		 for(int i=3; i<101; i++) {
			 dp[i] = dp[i-2]+dp[i-3];
		 }
		 
		 for(int i=0; i<n; i++) {
			 System.out.println(dp[Integer.parseInt(br.readLine())]);
		 }
	}

}
