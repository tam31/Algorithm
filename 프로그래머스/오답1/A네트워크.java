package 오답1;
import java.util.*;
public class A네트워크 {
	static boolean[] vis;
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
	
		vis = new boolean[n];
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				ans +=1;
				dfs(i, computers);
			}
		}
		System.out.println(ans);
	}
	private static void dfs(int idx, int[][] computers) {
		for(int i=0; i<computers.length ;i++) {
			if(!vis[i] && computers[idx][i]==1) {
				vis[i] = true;
				dfs(i,computers);
			}
		}
	}

}
