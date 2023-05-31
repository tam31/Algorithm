package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A5525 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int[] dp = new int[m];
		int ans = 0;
		for(int i=2; i<m; i++) {
			String a = str.substring(i-2, i+1);
			if(a.equals("IOI")) {
				dp[i] = dp[i-2]+1;
			}
			
			if(dp[i]>=n) {
				ans +=1;
			}
		}
		
		System.out.println(ans);
		
	}

}
