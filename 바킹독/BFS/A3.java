package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A3 {
	static int n;
	static int m;
	static int[][] arr;
	static int[][] vis;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		LinkedList<int[]> que = new LinkedList<>();
		vis = new int[m][n];
		//배열넣기
		arr = new int[m][n];
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					que.add(new int[] {i,j});
				}
				if(arr[i][j] == 0) {
					vis[i][j] = -1;
				}
			}
		}
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int k=0; k<4; k++) {
				int nx = point[0] + dx[k];
				int ny = point[1] + dy[k];
				if(nx>=0 && nx<m && ny>=0 && ny<n && vis[nx][ny] == -1) {
					que.add(new int[] {nx,ny});
					arr[nx][ny] = 1;
					vis[nx][ny] = vis[point[0]][point[1]] +1;
				}
			}
		}
	
		int cnt = 0;
		for(int i =0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(vis[i][j] == -1) {
					System.out.println(-1);
					return;
				}
				cnt = Math.max(cnt, vis[i][j]);
			}
		}
		System.out.println(cnt);
	}

}
