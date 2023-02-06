package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A4 {
	static int n;
	static int m;
	static char[][] board;
	static int[][] vis;
	static int[][] vis2;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		vis = new int[n][m];
		vis2 = new int[n][m];
		
		for(int i=0; i<n; i++) {
			
			Arrays.fill(vis[i], -1);
			Arrays.fill(vis2[i], -1);
		}
			
		Queue<int[]> que = new LinkedList<>();
		Queue<int[]> que2 = new LinkedList<>();
		for(int i=0; i<n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j=0; j<m; j++) {
				
				if(board[i][j] == 'F') {
					que.add(new int[] {i,j});
					vis[i][j] = 0;
				}
				if(board[i][j] == 'J') {
					que2.add(new int[] {i,j});
					vis2[i][j] = 0;
				}
			}
		}
		
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int k=0; k<4; k++) {
				int nx = point[0] + dx[k];
				int ny = point[1] + dy[k];
				if(nx>=0 && nx<n && ny>=0 && ny<m && vis[nx][ny] == -1 && board[nx][ny] != '#') {
					vis[nx][ny] = vis[point[0]][point[1]] +1;
					que.add(new int[] {nx,ny});
				}
			}
		}
//		System.out.println(Arrays.deepToString(vis));
		
		while(!que2.isEmpty()) {
			int[] point = que2.poll();
			for(int k=0; k<4; k++) {
				int nx = point[0] + dx[k];
				int ny = point[1] + dy[k];
//				System.out.printf("%d %d %d %d %d\n",nx,ny, vis[nx][ny], point[0], point[1]);
				if(nx<0 || nx >=n || ny<0 || ny>=m) {
					System.out.println(vis2[point[0]][point[1]]+1);
//					System.out.println(Arrays.deepToString(vis2));
					return;
				}
				if(vis2[nx][ny] >=0 || board[nx][ny] == '#') continue;
				if(vis[nx][ny] != -1 && vis[nx][ny] <= vis2[point[0]][point[1]]+1) continue;
				vis2[nx][ny] = vis2[point[0]][point[1]] + 1;
				que2.add(new int[] {nx,ny});
			}
		}
		System.out.println("IMPOSSIBLE");
	}

}
