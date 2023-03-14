package 일차3;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		long n = 12345;
		
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		String str = sb.reverse().toString();
		System.out.println(str);
		
		int[] arr = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i)-'0';
		}
		System.out.println(Arrays.toString(arr));
	}

}
