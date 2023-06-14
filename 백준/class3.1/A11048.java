package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11048 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 0;
		int[][] dp = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i==0) {
					if(j==0) {
						dp[i][j] = map[i][j];
					}else {
						dp[i][j] = dp[i][j-1]+map[i][j];
					}
				}else {
					if(j==0) {
						dp[i][j] = Math.max(dp[i][j], dp[i-1][j])+map[i][j];
					}else {
						dp[i][j] = Math.max(dp[i-1][j], Math.max(dp[i-1][j-1], dp[i][j-1]))+map[i][j];
					}
				}
				max = Math.max(max, dp[i][j]);
			}
			
		}
		
		System.out.print(max);
		
		
	}

}
