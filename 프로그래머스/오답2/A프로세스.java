package 오답2;
import java.util.*;
public class A프로세스 {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> list = new LinkedList<>();
		for(int i=0; i<priorities.length; i++) {
			que.add(priorities[i]);
			list.add(i);
		}
		
		int cnt = 0;
		while(!que.isEmpty()) {
			int max = Collections.max(que);
			int idx = list.poll();
			int num = que.poll();
			
			if(max==num) {
				cnt +=1;
				if(idx==location) {
					break;
				}
				continue;
			}
			
			que.add(num);
			list.add(idx);
		}
		System.out.println(cnt);
	}

}
