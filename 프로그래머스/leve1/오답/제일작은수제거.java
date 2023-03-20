package 오답1;

import java.util.Arrays;

public class 제일작은수제거 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		
		if(arr.length==1) {
			int[] ans = {-1};
			return;
		}else {
			int[] ans = new int[arr.length-1];
			int min = Integer.MAX_VALUE;
			for(int i=0; i<arr.length; i++) {
				min = Math.min(min, arr[i]);
			}
			System.out.println(min);
			int i=0;
			int j=0;
			while(j<arr.length) {
				
				if(arr[j] != min) {
					ans[i] = arr[j];
					i+=1;
					j+=1;
				}else {
					j+=1;
				}
				
			}
			System.out.println(Arrays.toString(ans));
		}
	}

}
