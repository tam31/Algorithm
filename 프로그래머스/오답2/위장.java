package 오답2;
import java.util.*;
public class 위장 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, 
				{"green_turban", "headgear"}};
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<clothes.length; i++) {
			String str = clothes[i][1];
			if(!map.containsKey(str)) {
				map.put(str, 1);
			}else {
				map.put(str, map.getOrDefault(str, 0)+1);
			}
			
		}
		int ans = 1;
		for(String a:map.keySet()) {
			ans *= (map.get(a)+1);
		}
		ans -=1;
		System.out.println(ans);
	}

}
