package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2 {
	static int n;
	static int m;
	static char[][] arr;
	static int[][] vis;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		//배열 넣기
		vis = new int[n][m];
		arr = new char[n][m];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		
		Queue<int []> que = new LinkedList<>();
		vis[0][0] = 1;
		que.add(new int[] {0,0});
		
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int i=0; i<4; i++) {
				int nx = point[0] + dx[i];
				int ny = point[1] + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && vis[nx][ny] == 0 && arr[nx][ny] == '1') {
					vis[nx][ny] = vis[point[0]][point[1]] +1;
					que.add(new int[] {nx,ny});
				}
			}
		}
		
		System.out.println(vis[n-1][m-1]);
	}

}
