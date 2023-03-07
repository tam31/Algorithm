package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A12_1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int cnt1 = 0; //1로 바꿀때
		int cnt2 = 0; //0로 바꿀때
		
		if(str.charAt(0)=='0') {
			cnt1 +=1;
		}else {
			cnt2+=1;
		}
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				if(str.charAt(i+1) == '1') {
					cnt2 +=1;
				}else {
					cnt1 +=1;
				}
				
			}
		}
		System.out.println(Math.min(cnt1, cnt2));
	}

}
