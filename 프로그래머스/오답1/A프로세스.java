package 오답1;
import java.util.*;
public class A프로세스 {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		
		for(int i=0; i<priorities.length; i++) {
			que1.add(priorities[i]);
			que2.add(i);
		}
		
		int cnt = 0;
		while(true) {
			int max = Collections.max(que1);
			int num = que1.poll();
			int idx = que2.poll();
			
			if(max==num) {
				cnt+=1;
				if(idx==location) {
					break;
				}
			}else {
				que1.add(num);
				que2.add(idx);
			}
			
		}
		System.out.println(cnt);
	}

}
