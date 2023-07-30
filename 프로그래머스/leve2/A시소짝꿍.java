package leve2;
import java.util.*;
public class A시소짝꿍 {

	public static void main(String[] args) {
		int[] weights = {100,180,360,100,270};
		
		Arrays.sort(weights);
		Map<Double, Integer> map = new HashMap<>();
		int ans = 0;
		for(int i=0; i<weights.length; i++) {
			double a = weights[i] * 1.0;
			double b = (weights[i] * 2.0)/3;
			double c = (weights[i] * 1.0)/2;
			double d = (weights[i] * 3.0)/4;
			
			if(map.containsKey(a)) ans += map.get(a);
			if(map.containsKey(b)) ans += map.get(b);
			if(map.containsKey(c)) ans += map.get(c);
			if(map.containsKey(d)) ans += map.get(d);
			
			map.put(a, map.getOrDefault(a, 0)+1);
			
			
		}
		
		System.out.println(ans);
	}

}
