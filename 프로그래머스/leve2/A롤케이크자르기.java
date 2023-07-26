package leve2;
import java.util.*;
public class A롤케이크자르기 {
	static int ans = 0;
	public static void main(String[] args) {
		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<topping.length; i++) {
			map.put(topping[i], map.getOrDefault(topping[i],0)+1);
			set.add(topping[i]);
		}
		
		Set<Integer> list = new HashSet<>();
		
		for(int i=0; i<topping.length; i++) {
			list.add(topping[i]);
			map.put(topping[i], map.getOrDefault(topping[i],0)-1);
			if(map.get(topping[i])==0) {
				set.remove(topping[i]);
			}
			
			if(list.size()==set.size()) ans +=1;
		}
		System.out.println(ans);
	}
}
