package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1213 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		//대문자 알파벳 배열
		int[] arr = new int[26];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'A'] += 1;
		}
		
		//홀수가 2개이상이면 아웃
		int cnt = 0;
		for(int i=0; i<26; i++) {
			if(arr[i] % 2 !=0) {
				cnt +=1;
			}
		}

		if(cnt >1) {
			System.out.println("I'm Sorry Hansoo");
		}else {
			StringBuilder sb = new StringBuilder();
			String ans ="";
			
			//해당 알파벳을 반만 넣음
			for(int i=0; i<26; i++) {
				for(int j=0; j<arr[i]/2; j++) {
					sb.append((char)(i+'A'));
				}
			}
			
			ans = sb.toString();
//			System.out.println(ans);
			String end = sb.reverse().toString();
			sb = new StringBuilder();
			//홀수개 넣기
			for(int i=0; i<26; i++) {
				if(arr[i]%2 !=0) {
					sb.append((char)(i+'A'));
				}
			}
			ans += sb.toString()+end;
			System.out.println(ans);
		}
	}

}
