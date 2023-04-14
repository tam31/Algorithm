package 오답1;
import java.util.*;
public class 디펜스게임 {

	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		int[] enemy = {4, 2, 4, 5, 3, 3, 1};
		
		int ans = 0;
		int m = enemy.length;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<m; i++) {
			que.add(enemy[i]);
			
			if(que.size()>k) {
				n-=que.poll();
			}
			
			ans = i+1;
			if(n<0) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
