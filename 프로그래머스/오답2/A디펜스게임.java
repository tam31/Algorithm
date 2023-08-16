package 오답2;
import java.util.*;
public class A디펜스게임 {

	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		int[] enemy = {4, 2, 4, 5, 3, 3, 1};
		
		int cnt = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=0; i<enemy.length; i++) {
			System.out.println(q);
			q.add(enemy[i]);
			
			if(q.size()>k) {
				n-=q.poll();
			}
			if(n<0) {
				break;
			}
			cnt +=1;
		}
		System.out.println(cnt);
	}

}
