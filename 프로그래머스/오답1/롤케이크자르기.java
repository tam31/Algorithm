package 오답1;
import java.util.*;
public class 롤케이크자르기 {

	public static void main(String[] args) {
		int[] topping = {1,2,1,3,1,4,1,2};
		
		int cnt = 0;
		int n = topping.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int num = topping[i];
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, map.getOrDefault(num, 0)+1);
			}
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<n; i++) {
			int num = topping[i];
			set.add(num);
			if(map.containsKey(num)) {
				map.put(num, map.get(num)-1);
				if(map.get(num)==0) {
					map.remove(num);
				}
			}
			if(set.size()==map.size()) {
				cnt +=1;
			}
		}
		System.out.println(cnt);
	}

}
