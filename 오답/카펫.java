package 프로그래머스;

import java.util.Arrays;

public class 카펫 {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		
		int ans[] = new int[2];
		for(int i=1; i<=yellow ; i++) {
			if(yellow%i==0) {
				int num = i*2+(yellow/i)*2 +4;
				if(num == brown) {
					ans[1] = yellow/i+2;
					ans[0] = i+2;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
