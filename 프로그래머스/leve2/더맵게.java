package leve2;
import java.util.*;
public class 더맵게 {

	public static void main(String[] args) {
		
		int[] sc = {1, 2, 3, 9, 10, 12};
		int k = 7;
		
		int cnt= 0;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<sc.length; i++) {
			que.add(sc[i]);
		}
		
		System.out.println(que);
		while(!que.isEmpty()) {
			
			if(que.size()==1) {
				if(que.peek()>=k) {
					System.out.println(cnt);
					break;
				}else {
					System.out.println(-1);
					break;
				}
			}
			
			if(que.peek()>=k) {
				System.out.println(cnt);
				break;
			}else {
				int a = que.poll();
				int b = que.poll();
				int num = a+b*2;
				que.add(num);
				System.out.println(que);
				cnt +=1;
			}
			
			
		}
		System.out.println(cnt);
	}

}
