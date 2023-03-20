package 오답1;

import java.util.ArrayList;
import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		int ans = n-lost.length;
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					reserve[j] = -1;
					lost[i] = -1;
					ans +=1;
				}
			}
		}
		
		
		for(int i=0; i<lost.length; i++) {
			if(lost[i] != -1) {
				for(int j=0; j<reserve.length; j++) {
					int num = reserve[j];
					if(num-1==lost[i]||num+1==lost[i]) {
						ans +=1;
						lost[i] = -1;
						reserve[j] = -1;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
