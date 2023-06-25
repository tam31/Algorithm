package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[n];
		dp[0]=arr[0];
		for(int i=1; i<n; i++) {
			if(i==1) {
				dp[1] = arr[0]+arr[1];
			}else if(i==2) {
				dp[2] = Math.max(arr[0], arr[1])+arr[2];
			}else {
				dp[i] = Math.max(arr[i-1]+dp[i-3], dp[i-2])+arr[i];
			}
		}
		System.out.println(dp[n-1]);
	}

}
