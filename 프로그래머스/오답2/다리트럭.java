package 오답2;
import java.util.*;
public class 다리트럭 {

	public static void main(String[] args) {
		int[] truck_weights = {7,4,5,6};
		int bridge_length = 2;
		int weight = 10;
		
		int n = truck_weights.length;
		Queue<Integer> que = new LinkedList<>();
		int cnt = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			int truck = truck_weights[i];
			while(true) {
				if(que.isEmpty()) {
					que.add(truck);
					sum += truck;
					cnt +=1;
					break;
				}
				if(que.size()==bridge_length) {
					sum-=que.poll();
				}else {
					if(sum+truck <=weight) {
						sum += truck;
						cnt +=1;
						que.add(truck);
						break;
					}else {
						que.add(0);
						cnt +=1;
					}
				}
			}
		}
		System.out.println(cnt+bridge_length);
	}

}
