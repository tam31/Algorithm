package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A03 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		int cnt1=0;//0으로 바꿀때
		int cnt2=0;//1로 바꿀때
		
		//0으로 바꿀때
		int i=0;
		boolean ans = true;
		while(i < n.length()) {
			if(n.charAt(i) == '0' && !ans) {
				cnt1 += 1;
				ans = true;
			}else if(n.charAt(i)== '1' && ans) {
				ans = false;
			}
			i+=1;
		}
		if(!ans) cnt1 +=1;
		
		//1로 바꿀때
		i=0; ans = true;
		while(i<n.length()) {
			if(n.charAt(i) == '1' && !ans) {
				cnt2 +=1;
				ans = true;
			}else if(n.charAt(i) == '0' && ans) {
				ans = false;
			}
			i+=1;
		}
		if(!ans) cnt2+=1;
		System.out.println(Math.min(cnt1, cnt2));
	}
}
