package 오답2;
import java.util.*;
public class A뉴스클러스터링 {
	static List<String> list1 = new ArrayList<>();
	static List<String> list2 = new ArrayList<>();
	public static void main(String[] args) {
		String str1 = "aa1+aa2";
		String str2 = "e=m*c^2";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		addList(str1, list1);
		addList(str2, list2);
		
		int sum=0;
		int cnt=0;
		for(String tmp:list2) {
			if(list1.remove(tmp)) {
				cnt+=1;
			}
			sum+=1;
		}
		
		sum+=list1.size();
		int ans =0;
		if(sum==0) {
			ans = 65536;
		}else {
			ans = (int)((1.0*cnt/sum)*65536);
		}
		
		System.out.println(cnt+" "+sum+" "+ans);
		
		
		
	}
	private static void addList(String str, List<String> list) {
		for(int i=0; i<str.length()-1; i++) {
			char a = str.charAt(i);
			char b = str.charAt(i+1);
			if((a>='a' && a<='z') && (b>='a' &&b <='z')) {
				list.add(a+""+b);
			}
		}
	}
}
