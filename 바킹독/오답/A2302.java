package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long dp[] = new long[41];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2; i<41; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		int m = Integer.parseInt(br.readLine());

		int sum=1;
		int temp = 0;
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(br.readLine());
			sum *= dp[num-temp-1];
			temp = num;
		}
		sum *= dp[n-temp];
		System.out.println(sum);
	}

}
