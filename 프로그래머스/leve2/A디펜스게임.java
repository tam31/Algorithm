package leve2;
import java.util.*;
public class A디펜스게임 {
	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		int[] enemy = {4, 2, 4, 5, 3, 3, 1};
		
		int ans = 0;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<enemy.length; i++) {
			int num = enemy[i];
			System.out.println(que+" "+num);
			if(que.size()<k) {
				que.add(num);
				ans +=1;
			}else {
				if(que.peek()<num) {
					if(n-que.peek()<0) {
						break;
					}
					n-=que.poll();
					que.add(num);
					ans +=1;
				}else {
					if(n-num<0) {
						break;
					}
					n-=num;
					ans +=1;
				}
			}
		}
		System.out.println(ans);
	}
}
