package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1339 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[26];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				arr[str.charAt(j)-'A'] += (int)Math.pow(10, str.length()-1-j);
			}
		}
	
		Arrays.sort(arr);
		int num = 9;
		int sum = 0;
		for(int i=25; i>=0; i--) {
			if(arr[i] > 0) {
				sum += arr[i]*num;
				num -=1;
			}
		}
		System.out.println(sum);
	}
	

}
