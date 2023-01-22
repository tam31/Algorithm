package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9465 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int nums = Integer.parseInt(br.readLine());
		for(int num=0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[2][n+1];
			for(int i=0; i<2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=1; j<=n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			int[][] dp = new int[2][n+1];
			dp[0][1] = arr[0][1]; dp[1][1] = arr[1][1];
			
			int max = 0;
			for(int i=0; i<2; i++) {
				for(int j=2; j<=n; j++) {
					dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2])+arr[0][j];
					dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2])+arr[1][j];
				}
				max = Math.max(dp[0][n], dp[1][n]);
			}
			sb.append(max+"\n");
		}
		
		
		System.out.println(sb);

	}

}
