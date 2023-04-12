package 오답2;
import java.util.*;
public class 할인행사 {

	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		
		int n = discount.length;
		int m = number.length;
		int cnt = 0;
		Map<String,Integer> map1 = new HashMap<>();
		for(int i=0; i<m; i++) {
			map1.put(want[i],number[i]);
		}
		
		for(int i=0; i<=n-10; i++) {
			
			Map<String, Integer> map2 = new HashMap<>();
			for(int j=i; j<i+10; j++) {
				map2.put(discount[j], map2.getOrDefault(discount[j],0)+1);
			}
			boolean check = true;
			for(String str: map1.keySet()) {
				if(map1.get(str) != map2.get(str)) {
					check = false;
					break;
				}
			}
			
			if(check) {
				cnt +=1;
			}
			
		}
	
		System.out.println(cnt);
	}

}
