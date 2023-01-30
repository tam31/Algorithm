package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이코테7 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int cnt1=0;
		int cnt2=0;
		
		for(int i=0; i<str.length()/2; i++) {
			cnt1 += str.charAt(i)-'0';
		}
		
		for(int i=str.length()/2; i<str.length(); i++) {
			cnt2 += str.charAt(i)-'0';
		}
		
		String ans = "READY";
		if(cnt1==cnt2) {
			ans = "LUCKY";
		}
		System.out.println(ans);
	}

}
