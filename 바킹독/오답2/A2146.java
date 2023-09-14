package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2146{
	static int n;
	static int[][] arr;
	static boolean[][] vis;
	static int count = 2;
	static int ans = Integer.MAX_VALUE;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 1) {
					makeland(i,j);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] != 0) {
					vis = new boolean[n][n];
					bfs(i,j);
				}
			}
		}
		System.out.println(ans);
		
	}
	private static void bfs(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j,0});
		vis[i][j] = true;
		int now = arr[i][j];
		while(!que.isEmpty()) {
			
			int[] data = que.poll();
			for(int k=0; k<4; k++) {
				int nx = data[0]+dx[k];
				int ny= data[1]+dy[k];
				
				if(nx<0||nx>=n||ny<0||ny>=n||vis[nx][ny]) continue;
				if(arr[nx][ny] != now) {
					if(arr[nx][ny] == 0) {
						que.add(new int[] {nx,ny,data[2]+1});
						vis[nx][ny] = true;
					}else {
						ans = Math.min(ans, data[2]);
					}
				}
			}
		}
	}
	private static void makeland(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		arr[i][j] = count;
		que.add(new int[] {i,j});
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int k=0; k<4; k++) {
				int nx = data[0] + dx[k];
				int ny = data[1] + dy[k];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<n&&arr[nx][ny] == 1) {
					arr[nx][ny] = count;
					que.add(new int[] {nx,ny});
				}
			}
		}
		count +=1;
	}

}
