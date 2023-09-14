package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A7576 {
	static int n;
	static int m;
	static int[][] arr;
	static int[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		vis = new int[n][m];
		
		for(int i=0; i<n; i++) {
			Arrays.fill(vis[i], -1);
		}
		
		Queue<int[]> que = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					vis[i][j] = 0;
					que.add(new int[] {i,j});
				}else if(arr[i][j] == -1) vis[i][j] = 0;
			}
		}
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int i=0; i<4; i++) {
				int nx = data[0] + dx[i];
				int ny = data[1] + dy[i];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<m&& vis[nx][ny] == -1 && arr[nx][ny] == 0) {
					vis[nx][ny] = vis[data[0]][data[1]] + 1;
					que.add(new int[] {nx,ny});
				}
			}
		}
		int cnt = 0;
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
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
