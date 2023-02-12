package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2206 {
	static int n;
	static int m;
	static char[][] arr;
	static boolean[][][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static Queue<int[]> que;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		que = new LinkedList<>();
		que.add(new int[] {0,0,1,0});
		vis = new boolean[n][m][2];
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			
			if(data[0] == n-1 && data[1] == m-1) {
				System.out.println(data[2]);
				return;
			}
			
			for(int i=0; i<4; i++) {
				int nx = data[0]+dx[i];
				int ny = data[1]+dy[i];
				
				
				
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				
				int next = data[2]+1;
				//길일때
				if(arr[nx][ny] == '0') {
					//벽을 부순적 없고 가보지 않은 길
					if(data[3] == 0 && !vis[nx][ny][0]) {
						vis[nx][ny][0] = true;
						que.add(new int[] {nx,ny,next,0});
					}else if(data[3] == 1 && !vis[nx][ny][1]) {//벽을 한번이라도 부술때
						vis[nx][ny][1] = true;
						que.add(new int[] {nx,ny,next,1});
					}
				}
				//벽일때
				else if(arr[nx][ny] =='1') {
					if(data[3] == 0) {//벽을 한번도 부순적이 없을때
						que.add(new int[] {nx,ny,next,1});
						vis[nx][ny][1] = true;
					}
				}
			}
		}
		System.out.println(-1);
	}

}
