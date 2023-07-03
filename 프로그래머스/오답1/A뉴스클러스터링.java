package 오답1;
import java.util.*;
public class A뉴스클러스터링 {

	public static void main(String[] args) {
		String str1 = "E=M*C^2	";
		String str2 = "e=m*c^2";
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		list1 = subString(str1,list1);
		list2 = subString(str2,list2);
		
		int same = 0;
		for(String tmp:list1) {
			if(list2.remove(tmp)) {
				same +=1;
			}
		}
		int sum = list1.size()+list2.size();
		int ans;
		if(sum==0) {
			ans = 65536;
		}else {
			ans = (int)((1.0*same)/sum*65536);
		}
		
		System.out.println(ans);
		System.out.println(0.0/1);
	}

	private static List<String> subString(String str, List<String> list) {
		for(int i=0; i<str.length()-1; i++) {
			char tmp1 = str.charAt(i);
			char tmp2 = str.charAt(i+1);
			if(tmp1>='a'&&tmp1<='z' && tmp2>='a'&&tmp2<='z') {
				list.add(tmp1+""+tmp2);
			}
		}
		return list;
	}

}
