package 오답1;
import java.util.*;
public class 시소짝꿍 {

	public static void main(String[] args) {
		int[] weights = {100,180,360,100,270};
		
		long ans = 0;
		Arrays.sort(weights);
		Map<Double, Integer> map = new HashMap<>();
		for(int i=0; i<weights.length; i++) {
			int we = weights[i];
			
			
			double a = (we*1.0);
			double b = (we*2.0)/3;
			double c = (we*3.0)/4;
			double d = (we*1.0)/2;
			
			if(map.containsKey(a)) ans += map.get(a);
			if(map.containsKey(b)) ans += map.get(b);
			if(map.containsKey(c)) ans += map.get(c);
			if(map.containsKey(d)) ans += map.get(d);
			
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		System.out.println(ans);
	}

}
