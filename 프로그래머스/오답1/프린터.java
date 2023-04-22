package 오답1;
import java.util.*;
public class 프린터 {

	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;
		
		int n = priorities.length;
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> idx = new LinkedList<>();
		for(int i=0; i<n; i++) {
			que.add(priorities[i]);
			idx.add(i);
		}
		int cnt = 0;
		while(true) {
			int max = Collections.max(que);
			int num = que.poll();
			int num2 = idx.poll();
			
			if(max == num) {
				cnt +=1;
				if(num2==location) {
					break;
				}
			}else {
				que.add(num);
				idx.add(num2);
			}
		}
		System.out.println(cnt);
	}

}
