package leve2;
import java.util.*;
public class A의상 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
	
		Map<String, Integer> map = new HashMap<>();
		for(String[] str: clothes) {
			map.put(str[1], map.getOrDefault(str[1], 0)+1);
		}
		
		int ans = 1;
		for(String str :map.keySet()) {
//			System.out.println(map.get(str));
			ans *= (map.get(str)+1);
		}
		ans -=1;
		System.out.println(ans);
	}

}
