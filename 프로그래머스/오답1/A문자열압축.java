package 오답1;
import java.util.*;
public class A문자열압축 {

	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		
		int len = s.length();
		int max = s.length();
		for(int i=1; i<len; i++) {
			String str = "";
			String tmp = s.substring(0,i);
			int cnt = 1;
			for(int j=i; j<len; j+=i) {
				int num = Math.min(len, i+j);
				String check = s.substring(j,num);
				if(tmp.equals(check)) {
					cnt +=1;
				}else {
					if(cnt==1) {
						str+=tmp;
					}else {
						str+=cnt+tmp;
					}
					cnt =1;
					tmp = check;
				}
			}
			if(cnt!=1) {
				str += cnt+tmp;
			}else {
				str +=tmp;
			}
			
			max=Math.min(max, str.length());
			
		}
		System.out.println(max);
	}

}
