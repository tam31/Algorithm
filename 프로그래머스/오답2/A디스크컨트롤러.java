package 오답2;
import java.util.*;
public class A디스크컨트롤러 {

	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		int n = jobs.length;
		Arrays.sort(jobs, (o1,o2)->{
			return o1[0]-o2[0];
		});
		
		PriorityQueue<int[]> que = new PriorityQueue<>((o1,o2)->{
			return o1[1]-o2[1];
		});
		
		int now = 0;
		int sum = 0;
		int idx = 0;
		int count = 0;
		while(count < n) {
			while(idx < n && now>= jobs[idx][0]) {
				que.add(jobs[idx++]);
			}
			
			if(que.isEmpty()) {
				now = jobs[idx][0];
			}else {
				int[] q = que.poll();
				now = now+q[1];
				sum += now - q[0];
				count +=1;
			}
			
		}
		
		System.out.println(sum/n);
	}

}
