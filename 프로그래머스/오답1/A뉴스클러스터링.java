package leve2;
import java.util.*;
public class A뉴스클러스터링 {
	static List<String> list1 = new ArrayList<>();
	static List<String> list2 = new ArrayList<>();
	static List<String> same = new ArrayList<>();
	public static void main(String[] args) {
		String str1 = "abab";
		String str2 = "baba";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		checkString(str1, list1);
		checkString(str2, list2);
		
		int sum = list1.size() + list2.size();
		int same = count(list1,list2);
//		System.out.println(same);
		sum -= same;
		
		int ans = (int) ((same*1.0)/sum*65536);
		System.out.println(ans);
		
		
		
	}
	public static void checkString(String tmp, List<String> list) {
		for(int i=2; i<=tmp.length(); i++) {
			String str = tmp.substring(i-2, i);
			boolean check = true;
			for(int j=0; j<2; j++) {
				if(!(str.charAt(j)>='a' && str.charAt(j)<='z')) {
					check = false;
					break;
				}
			}
			if(check) list.add(str);
		}
	}
	
	
	public static int count(List<String> tmp1, List<String> tmp2) {
		List<String> a1 = new ArrayList<>();
		List<String> a2 = new ArrayList<>();
		if(tmp1.size()>=tmp2.size()) {
			a1=tmp1;
			a2=tmp2;
		}else {
			a1=tmp2;
			a2=tmp1;
		}
		int cnt = 0;
		for(String tmp:a2) {
			if(a1.contains(tmp)) {
				cnt +=1;
			}
		}
		return cnt;
		
	}

}
