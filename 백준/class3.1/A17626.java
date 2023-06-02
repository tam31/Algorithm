package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A17626 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[50001];
		dp[1] = 1;
		for(int i=2; i<50001; i++) {
			int min = Integer.MAX_VALUE;
			
			for(int j=1; j*j<=i; j++) {
				min = Math.min(min, dp[i-j*j]);
			}
			
			dp[i] = min+1;
		}
		
	}

}
