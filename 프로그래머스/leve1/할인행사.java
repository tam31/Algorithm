package 오답1;
import java.util.*;
public class 할인행사 {
	static int ans = 0;
	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3,2,2,2,1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
	
		Map<String, Integer> map = new HashMap<>();
		for(int i =0; i<want.length; i++) {
			map.put(want[i],number[i]);
		}
		
		for(int i=0; i<=discount.length-10; i++) {
			check(map, count(i,discount));
		}
		System.out.println(ans);
	}
	static private Map<String, Integer> count(int start, String[] discount) {
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=start; i<start+10; i++) {
			String a = discount[i];
			if(!map.containsKey(a)) {
				map.put(a, 1);
			}else {
				map.put(a, map.getOrDefault(a, 0)+1);
			}
			
		}
		return map;
	}
	static private void check(Map<String, Integer> map1, Map<String,Integer> map2) {
		for(String str : map1.keySet()) {
			if(map1.get(str) != map2.get(str)) {
				return;
			}
		}
		ans +=1;
	}
}
