package ����;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A11724 {
	static int[][] map;
	static boolean[] vis;
	static int n;
	static int m;
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
				func(i);
			}
		}
		System.out.println(cnt);
	}
	private static void func(int a) {
		if(vis[a]) {
			return;
		}
		
		vis[a] = true;
		for(int i=1; i<=n; i++) {
			if(map[a][i] == 1) {
				func(i);
			}
		}
	}
}
