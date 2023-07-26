package leve2;
import java.util.*;
public class A할인행사 {

	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3,2,2,2,1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
	
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<want.length; i++) {
			map.put(want[i], number[i]);
		}
		
		int ans = 0;
		for(int i=0; i<=discount.length-10; i++) {
			Map<String, Integer> list = new HashMap<>(map);
			for(int j=0; j<10; j++) {
				list.put(discount[i+j], list.getOrDefault(discount[i+j],0)-1);
			}
			if(func(list)) ans+=1;
		}
		System.out.println(ans);
	}
	private static boolean func(Map<String, Integer> list) {
		for(String key:list.keySet()) {
			if(list.get(key) !=0) return false;
		}
		return true;
	}
}	
