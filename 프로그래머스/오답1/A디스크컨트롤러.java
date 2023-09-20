package leve3;
import java.util.*;
public class A디스크컨트롤러 {

	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		int ans = 0;
		int now = 0;
		int idx = 0;
		int count = 0;
		
		Arrays.sort(jobs, (o1,o2)->{
			return o1[0]-o2[0];
		});
		
		PriorityQueue<int[]> q = new PriorityQueue<>((o1,o2)->{
			return o1[1]-o2[1];
		});
		
		while(count<jobs.length) {
			
			while(idx<jobs.length && jobs[idx][0]<=now) {
				q.add(jobs[idx++]);
			}
			
			if(q.isEmpty()) {
				now = jobs[idx][0];
			}else {
				int[] tmp = q.poll();
				now += tmp[1];
				ans += now-tmp[0];
				count++;
				
			}
		}
		ans = (int)Math.floor(ans/jobs.length);
		System.out.println(ans);
	}

}
