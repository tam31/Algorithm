package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1213 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		
		int[] alpha = new int[26];
		for(int i=0; i<a.length(); i++) {
			alpha[a.charAt(i)-'A'] += 1;
		}
		
		int cnt = 0;
		for(int i=0; i<26; i++) {
			if(alpha[i] % 2 != 0) {
				cnt +=1;
			}
		}
		//홀수개가 1개보다 많으면 안됌
		if(cnt >1) {
			System.out.println("I'm Sorry Hansoo");
		}else {
			String ans ="";
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<26; i++) {
				for(int j=0; j<alpha[i]/2; j++) {
					sb.append((char)(i+'A'));
				}
			}
			ans += sb.toString();
			String end = sb.reverse().toString();
			
			for(int i=0; i<26; i++) {
				if(alpha[i] % 2 != 0) {
					ans += (char)(i+'A');
				}
			}
			
			ans+=end;
			System.out.println(ans);
		}
	}

}
