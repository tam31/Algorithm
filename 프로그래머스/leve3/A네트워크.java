package leve3;
import java.util.*;
public class A네트워크 {
	static boolean[] vis;
	static int ans = 0;
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
	
		vis = new boolean[n];
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				func(n,computers,i);
				ans +=1;
			}
		}
		System.out.println(ans);
	}
	private static void func(int n, int[][] computers, int start) {
		for(int i=start; i<n; i++) {
			if(!vis[i] && computers[start][i]==1) {
				vis[i] = true;
				func(n,computers, i);
			}
		}
	}
}