package leve2;

import java.util.*;

public class 프린터 {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		int len = priorities.length;
		
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> idx = new LinkedList<>();
		for(int i = 0; i<len; i++) {
			que.add(priorities[i]);
			if(i==location) {
				idx.add(-1);
			}else {
				idx.add(0);
			}
			
		}
		//System.out.println(Collections.max(que));
		
		int cnt=0;
		int i = 0;
		while(!que.isEmpty()) {
			int max = Collections.max(que);
			int a = que.poll();
			int b = idx.poll();
			
			
			if(a == max) {
				cnt +=1;
				if(b == -1) {
					break;
				}
				continue;
			}
			
			que.add(a);
			idx.add(b);

			
		
		}
		System.out.println(cnt);
	}

}
