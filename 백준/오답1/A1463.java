package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		Arrays.fill(dp, 1000000);
		dp[1] = 0;
		for(int i=1; i<=n; i++) {
			
			if(i%3==0) {
				dp[i] = Math.min(dp[i/3]+1,dp[i]);
			}
			if(i%2==0){
				dp[i] = Math.min(dp[i/2]+1,dp[i]);
			}
			
			dp[i]= Math.min(dp[i-1]+1,dp[i]);
			
		}
		System.out.println(dp[n]);
	}

}
