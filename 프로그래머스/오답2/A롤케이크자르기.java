package 오답2;
import java.util.*;
public class A롤케이크자르기 {

	public static void main(String[] args) {
		int[] topping = {1,2,1,3,1,4,1,2};
		
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<topping.length; i++) {
			map.put(topping[i], map.getOrDefault(topping[i], 0)+1);
		}
		
		for(int i=0; i<topping.length; i++) {
			int num = topping[i];
			map.put(topping[i], map.getOrDefault(topping[i], 0)-1);
			
			if(map.get(topping[i]) == 0) {
				map.remove(topping[i]);
			}
			
			set.add(num);
			if(set.size()==map.size()) {
				ans+=1;
			}
		}
		System.out.println(ans);
	}

}
