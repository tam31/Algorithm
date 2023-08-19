package leve3;
import java.util.*;
public class A거스름돈 {
	public static void main(String[] args) {
		int n = 5;
		int[] money = {1,2,5};
		
		Arrays.sort(money);
		int[] dp = new int[n+1];
		dp[0] = 1;
		for(int tmp:money) {
			for(int i=tmp; i<=n; i++) {
				dp[i] += dp[i-tmp];
			}
		}
		System.out.println(dp[n]);
	}
}