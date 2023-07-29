package 오답1;
import java.util.*;
public class A디펜스게임 {

	public static void main(String[] args) {
		int n = 2;
		int k = 4;
		
		int ans = 0;
		int[] enemy = {3, 3, 3, 3};
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<enemy.length; i++) {
			que.add(enemy[i]);
			if(que.size()>k) {
				int a = que.poll();
				if(n-a<0) {
					break;
				}
				n-=a;
			}
			ans +=1;
		}
		
		System.out.println(ans);
	}

}
