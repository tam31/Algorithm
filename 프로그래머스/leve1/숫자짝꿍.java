package 일차6;

import java.util.ArrayList;
import java.util.Collections;

public class 숫자짝꿍 {

	public static void main(String[] args) {
		String X = "12321";
		String Y = "42531";
		
		StringBuilder sb = new StringBuilder();
		int[] x = new int[10];
		int[] y = new int[10];
		
		for(int i=0; i<X.length(); i++) {
			x[X.charAt(i)-'0'] +=1;
		}
		
		for(int i=0; i<Y.length(); i++) {
			y[Y.charAt(i)-'0'] +=1;
		}
		
		
		for(int i=9; i>=0; i--) {
			for(int j=0; j<Math.min(x[i], y[i]); j++) {
				sb.append(i);
			}
		}
		
		String ans = sb.toString();
		if(ans.equals("")) {
			System.out.println(-1);
		}else if(ans.charAt(0)=='0') {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
	}

}
