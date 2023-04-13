package 오답2;
import java.util.*;
public class 롤케이크자르기 {

	public static void main(String[] args) {
		int[] topping = {1, 2, 3, 1, 4};
		
		int n = topping.length;
		int cnt = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			map.put(topping[i], map.getOrDefault(topping[i], 0)+1);
		}
		for(int i=0; i<n; i++) {
			int num = topping[i];
			map.put(num, map.get(num)-1);
			set.add(num);
			
			if(map.get(num)==0) {
				map.remove(num);
			}
			if(map.size()==set.size()) cnt +=1;
		}
		
		System.out.println(cnt);
		
		
		
	}

}
