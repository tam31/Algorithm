package 오답2;
import java.util.*;
public class A문자열압축 {

	public static void main(String[] args) {
		String s = "aabbaccc";
		
		int max = s.length();
		
		for(int i=1; i<=s.length()/2; i++) {
			String tmp = "";
			String check = s.substring(0,i);
			int cnt = 1;
			for(int j=i; j<s.length(); j+=i) {
				int min = Math.min(s.length(), j+i);
				String str = s.substring(j,min);
				if(check.equals(str)) {
					cnt +=1;
				}else {
					if(cnt==1) {
						tmp += check;
					}else {
						tmp +=cnt+check;
					}
					check = str;
					cnt = 1;
				}
			}
			if(cnt==1) {
				tmp += check;
			}else {
				tmp+=cnt+check;
			}
			
			max = Math.min(max, tmp.length());
			
		}
		System.out.println(max);
	}

}
