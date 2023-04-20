package 오답1;
import java.util.*;
public class 다리트럭 {

	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		
		int n = truck_weights.length;
		int time=0;
		int sum = 0;
		Queue<Integer> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			int truck = truck_weights[i];
			while(true) {
				if(que.isEmpty()) {
					que.add(truck);
					time +=1;
					sum += truck;
					break;
				}else if(que.size() == bridge_length) {
					sum-=que.poll();
				}
				
				if(sum+truck <= weight) {
					que.add(truck);
					sum += truck;
					time +=1;
					break;
				}else {
					que.add(0);
					time +=1;
				}
			}
		}
		
		System.out.println(time+bridge_length);
	}

}
