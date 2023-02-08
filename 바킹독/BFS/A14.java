package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A14 {
	static int n;
	static int[][] arr;
	static int[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		//배열넣기
		arr = new int[n][n];
		vis = new int[n][n];
		int max = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
			}
		}
		int cnt = 0;
		for(int k=0; k<max; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(arr[i][j] <= k) {
						vis[i][j] = -1;
					}
				}
			}
			int count = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(vis[i][j] == 0) {
						count +=1;
						dfs(i,j);
						
					}
				}
			}
			
			for(int i=0; i<n; i++) {
				Arrays.fill(vis[i], 0);
			}
			
			cnt = Math.max(cnt, count);
			
		}
		System.out.println(cnt);
		
		
		
	}
	private static void dfs(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		vis[i][j] = 1;
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int k=0; k<4; k++) {
				int nx = data[0] + dx[k];
				int ny = data[1] + dy[k];
				if(nx>=0&&nx<n&&ny>=0&&ny<n&&vis[nx][ny] == 0) {
					vis[nx][ny] = 1;
					que.add(new int[] {nx,ny});
				}
			}
		}
		
	}

}
