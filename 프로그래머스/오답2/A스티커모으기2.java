package 오답2;
import java.util.*;
public class A스티커모으기2 {

	public static void main(String[] args) {
		int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
		
		int n = sticker.length;
		if(n==1) {
			System.out.println(sticker[0]);
		}else {
			int[] dp1 = new int[n];
			int[] dp2 = new int[n];
			
			dp1[0] = sticker[0];
			dp1[1] = dp1[0];
			for(int i=2; i<n-1; i++) {
				dp1[i] = Math.max(dp1[i-1], dp1[i-2]+sticker[i]);
			}
			
			dp2[1] = sticker[1];
			for(int i=2; i<n; i++) {
				dp2[i] = Math.max(dp2[i-2]+sticker[i], dp2[i-1]);
			}
			
			System.out.println(Math.max(dp1[n-2], dp2[n-1]));
		}
		
	}

}
