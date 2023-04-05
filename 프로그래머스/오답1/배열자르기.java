package 오답1;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int n = 4;
		int left = 7;
		int right = 14;
		
		int[] ans = new int[right-left+1];
		int count = 0;
		for(int i=left; i<=right; i++) {
			int h = i/n;
			int w = i%n;
			
			if(h>w) {
				ans[count] = h+1;
			}else {
				ans[count] = w+1;
			}
			
			count +=1;
		}
		System.out.println(Arrays.toString(ans));
	}

}
