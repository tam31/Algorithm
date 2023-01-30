package 구현;

import java.util.Arrays;

public class A4673 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[100000];
		for(int i=1; i<10001; i++) {
			int sum = i;
			String nums = Integer.toString(i);
			for(int j=0; j<nums.length(); j++) {
				sum += nums.charAt(j)-'0';
			}
			arr[sum] = true;
		}
		for(int i=1;i<10001; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}

}
