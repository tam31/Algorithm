package leve2;
import java.util.*;
public class A귤고르기 {

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int a:tangerine) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		int[][] list = new int[map.size()][2];
		int z = 0;
		for(int a : map.keySet()) {
			list[z][0] =a;
			list[z][1] = map.get(a);
			z++;
		}
		
		Arrays.sort(list, (o1,o2)->{
			
			return o2[1]-o1[1];
		});
		
		int ans = 0;
		for(int i=0; i<list.length; i++) {
			k -= list[i][1];
			ans +=1;
			if(k <= 0) break;
		}
		
		System.out.println(ans);
		
	}

}
