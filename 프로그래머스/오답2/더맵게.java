package 오답2;
import java.util.*;
public class 더맵게 {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int k = 7;
		
		int n = scoville.length;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			que.add(scoville[i]);
		}
		
		int cnt = 0;
		while(que.size()>1) {
			int a = que.poll();
			int b = que.poll();
			
			if(a>=k) {
				break;
			}
			
			int num = a+b*2;
			que.add(num);
			cnt +=1;
		}
		
		if(que.size()==1) {
			if(que.peek()<k) {
				cnt = -1;
			}
		}
		System.out.println(cnt);
	}

}
