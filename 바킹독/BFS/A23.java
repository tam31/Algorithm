package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A23 {
	static int n;
	static int m;
	static int k;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static char[][] arr;
	static boolean[][][] vis;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m];
		vis = new boolean[n][m][k+1];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0,0,1,0,});
		vis[0][0][0] = true;
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			if(data[0]==n-1&&data[1] == m-1) {
				System.out.println(data[2]);
				return;
			}
			for(int i=0; i<4; i++) {
				int nx = data[0] + dx[i];
				int ny = data[1] + dy[i];
				
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				
				if(arr[nx][ny] == '1') {
					if(data[3] < k && !vis[nx][ny][data[3]+1]) {
						vis[nx][ny][data[3]+1] = true;
						que.add(new int[] {nx,ny,data[2]+1,data[3]+1});
					}
				}else {
					if(!vis[nx][ny][data[3]]) {
						vis[nx][ny][data[3]] = true;
						que.add(new int[] {nx,ny,data[2]+1,data[3]});
					}
				}
			}
		}
		System.out.println(-1);
	}

}
