package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A11 {
	static int n;
	static int m;
	static int[][] arr;
//	static int[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
//		vis = new int[n][m];
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int y1 = Integer.parseInt(st.nextToken());
			int x1 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			for(int x=x1; x<x2; x++) {
				for(int y=y1; y<y2; y++) {
					arr[x][y] = 1;
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0) {
					int num = dfs(i,j);
					list.add(num);
					cnt +=1;
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for(int ans:list) {
			System.out.print(ans+" ");
		}
//		sys();
	}
	private static int dfs(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		arr[i][j] = 1;
//		vis[i][j] = 1;
		
		int cnt = 1;
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int k=0; k<4; k++) {
				int nx = data[0] + dx[k];
				int ny = data[1] + dy[k];
				if(nx>=0&&nx<n&&ny>=0&&ny<m && arr[nx][ny] == 0) { //&&vis[nx][ny] == 0
//					vis[nx][ny] = 1;
					cnt +=1;
					arr[nx][ny] = 1;
					que.add(new int[] {nx,ny});
					
				}
			}
		}
		
		return cnt;
	}
//	public static void sys() {
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				System.out.printf("%d ", vis[i][j]);
//			}
//			System.out.println();
//		}
//	}
}
