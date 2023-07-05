package leve2;
import java.util.*;
public class A프로세스 {

	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> idx = new LinkedList<>();
		for(int i=0; i<priorities.length; i++) {
			que.add(priorities[i]);
			idx.add(i);
		}
		
		int cnt = 0;
		while(true) {
			int max = Collections.max(que);
			int a = que.poll();
			int num = idx.poll();
			if(a==max) {
				cnt +=1;
				if(num==location) {
					break;
				}
			}else {
				idx.add(num);
				que.add(a);
			}
			
		}
		System.out.println(cnt);
	}

}
