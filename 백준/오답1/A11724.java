package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11724 {
	static int n;
	static int m;
	static int[][] map;
	static boolean[] vis;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][n+1];
		vis = new boolean[n+1];
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			if(!vis[i]) {
				cnt +=1;
				vis[i] = true;
				dfs(i);
				
			}
		}
		System.out.println(cnt);
		
	}
	private static void dfs(int x) {
		
		for(int i=1; i<=n; i++) {
			if(map[x][i]==1 && !vis[i]) {
				vis[i] = true;
				dfs(i);
			}
		}
	}
}
