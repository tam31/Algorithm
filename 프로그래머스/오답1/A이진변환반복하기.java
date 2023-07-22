package 오답1;
import java.util.*;
public class A이진변환반복하기 {

	public static void main(String[] args) {
		String s = "110010101001";
		
		int[] ans = new int[2];
		while(!s.equals("1")) {
			String tmp = "";
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) =='1') {
					tmp +="1";
				}else {
					ans[1] +=1;
				}
			}
			ans[0] +=1;
			s = Integer.toString(tmp.length(),2);
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
