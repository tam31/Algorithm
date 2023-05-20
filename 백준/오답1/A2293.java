package ¿À´ä;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[m+1];
		dp[0] = 1;
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			for(int j=a; j<=m; j++) {
				dp[j] = dp[j]+dp[j-a];
			}
		}
		
		System.out.println(dp[m]);
	}

}
