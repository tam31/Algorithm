package 오답1;
import java.util.*;
public class 귤고르기 {

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1,3,2,5,4,5,2,3};
		
		int n = tangerine.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
		}
		
		List<Integer> list = new ArrayList<>();
		for(int a : map.keySet()) {
			list.add(map.get(a));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int cnt = 0;
		for(int i=0; i<list.size(); i++) {
			k-=list.get(i);
			cnt +=1;
			if(k<=0) break;
		}
		
		System.out.println(cnt);
	}

}
