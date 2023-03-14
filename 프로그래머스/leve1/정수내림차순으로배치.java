package 일차3;

import java.util.Arrays;

public class 정수내림차순으로배치 {

	public static void main(String[] args) {
		
		long n = 118372;
		String str = Long.toString(n);
		
		int m = str.length();
		int[] arr = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = str.charAt(i)-'0';
		}
		Arrays.sort(arr);
		
		long ans = 0;
		for(int i=0; i<m; i++) {
			ans += arr[i]*(Math.pow(10,i));
		}
		System.out.println(ans);
	}

}
