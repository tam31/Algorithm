package 오답2;
import java.util.*;
public class 디펜스 {

	public static void main(String[] args) {
		int n = 2;
		int k = 4;
		int[] enemy = {3,3,3,3};
		
		int m = enemy.length;
		int cnt = 0;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<m; i++) {
			que.add(enemy[i]);
			if(que.size()>k) {
				n-=que.poll();
			}
			
			if(n < 0) {
				break;
			}
			
			cnt +=1;
		}
		
		System.out.println(cnt);
	}

}
