package leve3;
import java.util.*;
public class A이중우선순위큐 {

	public static void main(String[] args) {
		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
		
		for(String str: operations) {
			String[] tmp = str.split(" ");
//			System.out.println(Arrays.toString(tmp));
			
			int num = Integer.parseInt(tmp[1]);
			if(tmp[0].equals("I")) {
				q1.add(num);
				q2.add(num);
			}else if(tmp[0].equals("D") && !q2.isEmpty()) {
				if(num==1) {
					int max = q2.poll();
					q1.remove(max);
				}else {
					int min = q1.poll();
					q2.remove(min);
				}
			}

		}
		int[] ans = new int[2];
		if(!q2.isEmpty()) {
			ans[0] = q2.poll();
			ans[1] = q1.poll();
		}
		
		System.out.println(Arrays.toString(ans));
		
		
		
		
	}

}
