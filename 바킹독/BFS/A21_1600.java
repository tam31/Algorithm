package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A21_1600 {
	static int k;
	static int n;
	static int m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int[][] arr;
	static boolean[][][] vis;
	static int[] hx = {-1,-2,-2,-1,1,2,2,1};
	static int[] hy = {-2,-1,1,2,-2,-1,1,2};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		vis = new boolean[n][m][k+1];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0,0,0,0});
		vis[0][0][0] = true;
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
//			System.out.println(Arrays.toString(data));
			if(data[0]==n-1&&data[1]==m-1) {
				System.out.println(data[2]);
				return;
			}
			if(data[3]<k) {
				for(int i=0; i<8; i++) {
					int nx = data[0]+hx[i];
					int ny = data[1]+hy[i];
					
					if(nx<0||nx>=n||ny<0||ny>=m) continue;
					if(arr[nx][ny] !=0 || vis[nx][ny][data[3]+1]) continue;
					if(data[3]<k && !vis[nx][ny][data[3]+1]) {
						vis[nx][ny][data[3]+1] = true;
						que.add(new int[] {nx,ny,data[2]+1,data[3]+1});
					}
				}
			}
			
			for(int i=0; i<4; i++) {
				int nx = data[0]+dx[i];
				int ny = data[1]+dy[i];
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				if(arr[nx][ny] !=0 || vis[nx][ny][data[3]]) continue;
				
				vis[nx][ny][data[3]] = true;
				que.add(new int[] {nx,ny,data[2]+1,data[3]});
			}
			
		}
		System.out.println(-1);
	}

}
