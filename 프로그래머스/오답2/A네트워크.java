package 오답2;
import java.util.*;
public class A네트워크 {
	static boolean[] vis;
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
	
		vis = new boolean[n];
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				ans +=1;
				func(n,i,computers);
			}
		}
		System.out.println(ans);
	}
	private static void func(int n ,int now, int[][] computers) {
		for(int i=0; i<n; i++) {
			if(computers[now][i] == 1 && !vis[i]) {
				vis[i] = true;
				func(n, i, computers);
			}
		}
	}
}
