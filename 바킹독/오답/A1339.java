package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1339 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//알파벳배열
		int[] arr = new int[26];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				arr[str.charAt(j)-'A'] += Math.pow(10, str.length()-1-j);
			}
		}
		
		//오름차순으로 정렬
		Arrays.sort(arr);
		
		int ans = 0;
		int num = 9;
		for(int i=25; i>=0; i--) {
			ans += arr[i]*num;
			num -=1;
		}
		System.out.println(ans);
	}

}
