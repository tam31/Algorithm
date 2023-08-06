package 오답1;
import java.util.*;
public class A숫자변환하기 {
	static int[] vis;
	public static void main(String[] args) {
		int x = 10;
		int y = 40;
		int n = 30;
		
		vis = new int[y+1];
		Arrays.fill(vis, -1);
		vis[x] = 0;
		Queue<Integer> que = new LinkedList<>();
		que.add(x);
		while(!que.isEmpty()) {
			int a = que.poll();
			if(a+n<=y && vis[a+n] == -1) {
				vis[a+n] = vis[a]+1;
				que.add(a+n);
			}
			
			if(a*2<=y && vis[a*2] == -1) {
				vis[a*2] = vis[a]+1;
				que.add(a*2);
			}
			
			if(a*3<=y && vis[a*3] == -1) {
				vis[a*3] = vis[a]+1;
				que.add(a*3);
			}
		}
		
		System.out.println(vis[y]);
	}

}
