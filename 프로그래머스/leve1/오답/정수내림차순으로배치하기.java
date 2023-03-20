package 오답1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 118372;
		
		String[] str = String.valueOf(n).split("");
		Arrays.sort(str, Collections.reverseOrder());
		
		String a = "";
		for(int i=0; i<str.length; i++) {
			a+=str[i];
		}
		
		long ans = Long.parseLong(a);
		System.out.println(ans);
		
	}

}
