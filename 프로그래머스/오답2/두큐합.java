package 오답2;
import java.util.*;
public class 두큐합 {

	public static void main(String[] args) {
		int[] queue1 = {1,2,1,2};
		int[] queue2 = {1, 10, 1, 2};
		
		int n = queue1.length;
		int sum = 0;
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		int q1 =0, q2=0;
		
		for(int i=0; i<n; i++) {
			que1.add(queue1[i]);
			que2.add(queue2[i]);
			sum += queue1[i] + queue2[i];
			q1 += queue1[i];
			q2 += queue2[i];
		}
		
		if(sum %2 ==1) {
			System.out.println(-1);
		}
		
		int cnt = 0;
		while(cnt < n*3) {
			if(sum/2==q1) {
				break;
			}
			if(q1>q2) {
				int num = que1.poll();
				q1-=num;
				q2+=num;
				que2.add(num);
			}else {
				int num = que2.poll();
				q2-=num;
				q1+=num;
				que1.add(num);
			}
			cnt +=1;
		}
		
		System.out.println(cnt);
	}

}
