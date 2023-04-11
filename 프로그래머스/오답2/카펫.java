package 오답2;

import java.util.Arrays;

public class 카펫 {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		
		int ans[] = new int[2];
		for(int i=1; i<=yellow; i++) {
			int a = i*2;
			int b = (yellow/i)*2;
			
			if(a+b+4==brown && i*(yellow/i) == yellow) {
				ans[0] = i+2;
				ans[1] = yellow/i+2;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
