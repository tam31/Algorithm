package 오답1;
import java.util.*;
public class A메뉴리뉴얼 {
	static List<String> list = new ArrayList<>();
	static Map<String, Integer> map;
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		
		for(int i=0; i<course.length; i++) {
			map = new HashMap<>();
			for(int j=0; j<orders.length; j++) {
				char[] str = orders[j].toCharArray();
				Arrays.sort(str);
				func("", 0,str, course[i]);
			}
			int max = 0;
			for(String key:map.keySet()) {
				max = Math.max(max, map.get(key));
			}
			if(max == 1) continue;
			for(String key:map.keySet()) {
				if(map.get(key) == max) {
					list.add(key);
				}
			}
		}
		Collections.sort(list);
		String[] ans = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(ans));
	}
	
	static void func(String tmp, int cnt, char[] order, int num) {
		if(tmp.length()==num) {
			map.put(tmp, map.getOrDefault(tmp, 0)+1);
			return;
		}
		
		for(int i=cnt; i<order.length; i++) {
			func(tmp+order[i],i+1,order,num);
		}
	}

}
