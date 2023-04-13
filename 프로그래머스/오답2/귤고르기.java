package 오답2;
import java.util.*;
public class 귤고르기 {

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		int n = tangerine.length;
		int cnt = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int num = tangerine[i];
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Integer> list = new LinkedList<>();
		for(int a:map.keySet()) {
			list.add(map.get(a));
		}
		
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0; i<list.size(); i++) {
			k-=list.get(i);
			cnt +=1;
			if(k<=0) break;
		}
		
		System.out.println(cnt);
	}

}
