package leve3;
import java.util.*;
public class A야근지수 {

	public static void main(String[] args) {
		int n = 3;
		int[] works = {1,1};
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int tmp : works) {
			q.add(tmp);
		}
		
		long ans =0;
		for(int i=0; i<n; i++) {
			if(q.isEmpty()) {
				break;
			}
			
			int tmp = q.poll()-1;
			if(tmp ==0) continue;
			q.add(tmp);
		}
		System.out.println(q);
		while(!q.isEmpty()) {
			ans += Math.pow(q.poll(), 2);
		}
		System.out.println(ans);
	}

}
