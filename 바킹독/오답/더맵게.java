package 오답;
import java.util.*;
public class 더맵게 {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int k = 7;
		
		int n = scoville.length;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			que.add(scoville[i]);
		}
		
		while(!que.isEmpty()) {
			
			if(que.size()==1) {
				if(que.peek()>=k) {
					System.out.println(cnt);
					break;
				}else {
					cnt =-1;
				}
			}
			
			if(que.peek()>=k) {
				break;
			}
			
			int a = que.poll();
			int b = que.poll();
			int num = a + b*2;
			cnt +=1;
			que.add(num);
		}
		System.out.println(cnt);
	}

}
