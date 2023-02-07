package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A7 {
	static int n;
	static int[][] vis;
	static int[][] vis2;
	static char[][] arr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		vis = new int[n][n];
		vis2 = new int[n][n];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int cnt = 0;
		int cnt2 = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(vis[i][j] == 0) {
					dfs(i,j);
					cnt +=1;
				}
				if(vis2[i][j] == 0) {
					dfs2(i,j);
					cnt2 +=1;
				}
			}
		}
		System.out.printf("%d %d",cnt,cnt2);
	}

	private static void dfs2(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		vis2[i][j] = 1;
		
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int k=0; k<4; k++) {
				int nx = point[0] + dx[k];
				int ny = point[1] + dy[k];
				if(nx>=0 && nx<n && ny>=0 && ny <n && vis2[nx][ny] ==0) {
					if((arr[point[0]][point[1]] == 'R' || arr[point[0]][point[1]] == 'G')) {
						if((arr[nx][ny] == 'R' || arr[nx][ny] == 'G')) {
							que.add(new int[] {nx,ny});
							vis2[nx][ny] = 1;
						}
					}else {
						if(arr[nx][ny] == arr[point[0]][point[1]]) {
							que.add(new int[] {nx,ny});
							vis2[nx][ny] = 1;
						}
					}
					
				}
			}
		}
		
	}

	private static void dfs(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		vis[i][j] = 1;
		
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int k=0; k<4; k++) {
				int nx = point[0] + dx[k];
				int ny = point[1] + dy[k];
				if(nx>=0 && nx<n && ny>=0 && ny <n && arr[nx][ny] == arr[point[0]][point[1]] && vis[nx][ny] ==0) {
					que.add(new int[] {nx,ny});
					vis[nx][ny] = 1;
				}
			}
		}
	}

}
