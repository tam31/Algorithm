package 오답;
import java.util.*;
public class 위장 {

	public static void main(String[] args) {
		String[][] clothes = {
				{"yellow_hat", "headgear"}, 
				{"blue_sunglasses", "eyewear"}, 
				{"green_turban", "headgear"}};
		
		int n = clothes.length; 
		HashMap<String, Integer> list = new HashMap<>();
		for(int i=0; i<n; i++) {
			if(!list.containsKey(clothes[i][1])) {
				list.put(clothes[i][1], 1);
			}else {
				list.put(clothes[i][1], list.get(clothes[i][1])+1);
			}
		}
		
		int cnt = 1;
		for(String str: list.keySet()) {
			cnt *= (list.get(str)+1);
		}
		cnt -=1;
		System.out.println(cnt);
		
	}

}
