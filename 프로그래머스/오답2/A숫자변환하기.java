package 오답2;
import java.util.*;
public class A숫자변환하기 {

	public static void main(String[] args) {
		int x = 10;
		int y = 40;
		int n = 5;
		
		int[] ans = new int[y+1];
		Arrays.fill(ans, -1);
		ans[x] = 0;
		Queue<Integer> que = new LinkedList<>();
		que.add(x);
		while(!que.isEmpty()) {
			int a = que.poll();
			
			if(a*3<=y&& ans[a*3]==-1) { 
				ans[a*3] =ans[a]+1;
				que.add(a*3);
			}
			if(a*2<=y && ans[a*2]==-1) {
				ans[a*2] = ans[a]+1;
				que.add(a*2);
			}
			if(a+n<=y && ans[a+n]==-1) {
				ans[a+n] = ans[a]+1;
				que.add(a+n);
			}
		}
		System.out.println(ans[y]);
	}
	

}
