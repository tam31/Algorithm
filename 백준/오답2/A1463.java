package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		for(int i=2; i<=n; i++) {
			dp[i] = i-1;
			if(i%3 ==0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
			if(i%2 ==0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			dp[i] = Math.min(dp[i], dp[i-1]+1);
		}
		System.out.println(dp[n]);
	}

}
