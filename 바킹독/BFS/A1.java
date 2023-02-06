package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1 {
	static int n;
	static int m;
	static int[][] arr;
	static boolean[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//행과 열
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		vis = new boolean[n][m];
		//배열 넣기
		arr = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = 0; //그림의 갯수
		int count = 0; //그림의 크기 최대값
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 1 && !vis[i][j]) {
					cnt +=1;
					int num = bfs(i,j);
					count = Math.max(count, num);
				}
			}
		}
		System.out.println(cnt);
		System.out.println(count);
	}
	
	private static int bfs(int i, int j) {
		Queue<int []> que = new LinkedList<int[]>();
		que.add(new int[] {i,j});
		vis[i][j] = true;
		int cnt = 1;
		
		while(!que.isEmpty()) {
			int[] num = que.poll();
			for(int k =0; k<4; k++) {
				int nx = num[0] + dx[k];
				int ny = num[1] + dy[k];
				
				if(nx>=0 && nx <n && ny>=0 && ny<m && vis[nx][ny] == false && arr[nx][ny] == 1) {
					vis[nx][ny] = true;
					que.add(new int[] {nx,ny});
					cnt +=1;
				}
			}
		}
		return cnt;
	}

}
