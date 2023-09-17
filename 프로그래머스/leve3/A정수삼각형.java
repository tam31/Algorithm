package leve3;
import java.util.*;
public class A정수삼각형 {

	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
	
		int n = triangle.length;
		int m = triangle[n-1].length;
		
		int max = 0;
		int[][] dp = new int[n+1][m+1];
		for(int i=1; i<=n; i++) {
			int[] tmp = triangle[i-1];
			for(int j=1; j<=tmp.length; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+tmp[j-1];
				max = Math.max(max, dp[i][j]);
			}
		}
		
		System.out.println(max);
		
	}

}
