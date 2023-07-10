package 오답1;
import java.util.*;
public class A조이스틱 {

	public static void main(String[] args) {
		String name = "JAN";
		
		int len = name.length()-1;
		int cnt = 0;
		for(int i=0; i<name.length(); i++) {
			char a = name.charAt(i);
			cnt += Math.min('Z'-a+1, a-'A');
			
			int idx = i+1;
			while(idx<name.length() && name.charAt(idx)=='A') {
				idx +=1;
			}
			
			len = Math.min(len, i*2+(name.length()-idx));
			len = Math.min(len, (name.length()-idx)*2+i);
		}
		
		int ans = cnt+len;
		System.out.println(ans);
	}

}
