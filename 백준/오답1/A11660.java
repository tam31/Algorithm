package ¿¬½À;
import java.util.*;
public class A11660 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] dp = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int a = sc.nextInt();
				if(j==1) {
					dp[i][j] = a;
				}else {
					dp[i][j] = a+dp[i][j-1];
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			int sum = 0;
			for(int x=a; x<=c; x++) {
				sum += dp[x][d]-dp[x][b-1];
			}
			
			sb.append(sum+"\n");
		}
		System.out.println(sb);
	}

}
