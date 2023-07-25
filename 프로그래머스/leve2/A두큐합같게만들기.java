package leve2;
import java.util.*;
public class A두큐합같게만들기 {

	public static void main(String[] args) {
		int[] queue1 = {1,1};
		int[] queue2 = {1,5};
		
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		long sum = 0;
		long add1 = 0;
		long add2 = 0;
		for(int i=0; i<queue1.length; i++) {
			sum += queue1[i] + queue2[i];
			add1 += queue1[i];
			add2 += queue2[i];
			que1.add(queue1[i]);
			que2.add(queue2[i]);
		}
		
		long re = sum/2;
		int cnt = 0;
		boolean chek = false;
		while(cnt < queue1.length*3) {
			if(add1==re && add2 == re) {
				chek = true;
				break;
			}
			cnt +=1;
			if(add1>=re) {
				int tmp = que1.poll();
				add1 -= tmp;
				add2 +=tmp;
				que2.add(tmp);
			}else if(add2>=re){
				int tmp = que2.poll();
				add2 -= tmp;
				add1 +=tmp;
				que1.add(tmp);
			}
		}
		if(!chek) {
			cnt = -1;
		}
		System.out.println(cnt);
		
	}

}
