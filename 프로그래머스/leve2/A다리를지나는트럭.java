package leve2;
import java.util.*;
public class A다리를지나는트럭 {

	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		
		int cnt = 0;
		Queue<Integer> que = new LinkedList<>();
		int sum = 0;
		for(int i:truck_weights) {
			if(que.isEmpty()) {
				que.add(i);
				sum +=i;
				cnt +=1;
			}else {
				while(true) {
					System.out.println(sum+" "+i+" "+cnt);
					
					if(sum+i<=weight) {
						que.add(i);
                        sum +=i;
                        cnt+=1;
						break;
					}
					if(que.size()<bridge_length) {
						que.add(0);
						cnt+=1;
					}else {
						sum-=que.poll();
					}
				}
			}
		}
		System.out.println(cnt+bridge_length);
	}

}
