package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A2589 {
	static int n;
	static int m;
	static char[][] map;
	static int[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int ans = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] =='L') {
					bfs(i,j);
				}
			}
		}
		System.out.println(ans);
	}
	private static void bfs(int i, int j) {
		vis = new int[n][m];
		vis[i][j] = 1;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int k=0; k<4; k++) {
				int nx = data[0] + dx[k];
				int ny = data[1] + dy[k];
				if(nx>=0 && nx<n && ny>=0 &&ny<m && map[nx][ny]=='L' && vis[nx][ny]==0) {
					que.add(new int[] {nx,ny});
					vis[nx][ny] = vis[data[0]][data[1]]+1;
					ans = Math.max(vis[nx][ny]-1, ans);
				}
			}
		}
	
	}
	

}
