package leve2;
import java.util.*;
public class A카펫 {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		
		int[] ans = new int[2];
		for(int i=1; i<=yellow; i++) {
			int cnt = 4;
			if(yellow % i==0) {
				cnt +=(i*2)+(yellow/i)*2;
				if(cnt==brown) {
					ans[0]= 2+(yellow/i);
					ans[1]=2+i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
