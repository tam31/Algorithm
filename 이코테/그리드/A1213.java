package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1213 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		//배열로 해당 문자 넣기
		int[] arr = new int[26];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'A'] +=1;
		}
		//홀수가 2개이상이면 못함
		int cnt = 0;
		for(int i=0; i<26; i++) {
			if(arr[i] % 2 !=0) {
				cnt +=1;
			}
		}
		
		String ans ="";
		StringBuilder sb = new StringBuilder();
		if(cnt >=2) {
			System.out.println("I'm Sorry Hansoo");
		}else {
			for(int i=0; i<26; i++) {
				for(int j=0; j<arr[i]/2; j++) {
					sb.append((char)(i+65));
				}
			}
			
			ans += sb.toString();
			String end = sb.reverse().toString();
			
			sb = new StringBuilder();
			for(int i=0; i<26; i++) {
				if(arr[i] % 2 == 1) {
					sb.append((char)(i+65));
				}
			}
			
			ans += sb.toString()+end;
		}
		System.out.println(ans);
	}
}
