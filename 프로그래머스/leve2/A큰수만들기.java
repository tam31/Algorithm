package leve2;
import java.util.*;
public class A큰수만들기 {
	
	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;
		
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		for(int i=0; i<number.length()-k; i++) {
			char max = '0';
			for(int j=idx; j<=i+k; j++) {
				if(max<number.charAt(j)) {
					max = number.charAt(j);
					idx = j+1;
				}
			}
			sb.append(max);
		}
		
		System.out.println(sb.toString());
	}

}
