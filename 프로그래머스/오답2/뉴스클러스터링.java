package 오답2;
import java.util.*;
public class 뉴스클러스터링 {
	static List<String> s1 = new ArrayList<>();
	static List<String> s2 = new ArrayList<>();
	public static void main(String[] args) {
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		change(str1,s1);
		change(str2,s2);
		
		int re = 0;
		int sum = s1.size()+s2.size();
		for(int i=0; i<s1.size(); i++) {
			String tmp = s1.get(i);
			if(s2.remove(tmp)) {
				re +=1;
			}
		}
		if(sum ==0) {
			System.out.println(65536);
		}else {
			sum -= re;
			int ans = (int)((1.0*re)/sum * 65536);
			System.out.println(ans);
			
		}
		
		
		
	}
	private static void change(String str, List<String> s) {
		
		for(int i=0; i<str.length()-1; i++) {
			if((str.charAt(i)>='a'&&str.charAt(i)<='z') && 
					(str.charAt(i+1)>='a'&&str.charAt(i+1)<='z')) {
				String tmp = ""+ str.charAt(i)+str.charAt(i+1);
				s.add(tmp);
			}
				
		}
	}
}
