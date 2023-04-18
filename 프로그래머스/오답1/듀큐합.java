package 오답1;
import java.util.*;
public class 듀큐합 {

	public static void main(String[] args) {
		int[] queue1 = {3, 2, 7, 2};
		int[] queue2 = {4, 6, 5, 1};
		
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		long s1=0, s2=0, sum = 0;
		
		for(int i=0; i<queue1.length; i++) {
			que1.add(queue1[i]);
			que2.add(queue2[i]);
			s1 += queue1[i];
			s2 += queue2[i];
		}
		
		sum = s1+s2;
		
		int q1=0, q2=0;
		
		if(sum %2 == 1) {
			System.out.println(-1);
		}else {
			sum /=2;
			
			while(q1 <= queue1.length*2 && q2 <= queue1.length*2) {
				if(s1 == sum) {
					System.out.println(q1+q2);
					break;
				}
				
				if(s1>sum) {
					s1-= que1.peek();
					s2+= que1.peek();
					que2.add(que1.poll());
					q1 +=1;
				}else {
					s1+= que2.peek();
					s2-= que2.peek();
					que1.add(que2.poll());
					q2 +=1;
				}
				
			}
			
			System.out.println(-1);
		}
		
		
	}

}
