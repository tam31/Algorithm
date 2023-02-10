package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A7569 {
	static int n;
	static int m;
	static int h;
	static int[][][] arr;
	static int[] dh = {1,-1,0,0,0,0};
	static int[] dx = {0,0,1,-1,0,0};
	static int[] dy = {0,0,0,0,1,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		Queue<int[]> que = new LinkedList<>();
		arr = new int[h][n][m];
		for(int z=0; z<h; z++) {
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					arr[z][i][j] = Integer.parseInt(st.nextToken());
					if(arr[z][i][j] == 1) {
						que.add(new int[] {z,i,j});
					}
				}
			}
		}
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int i=0; i<6;i++) {
				int nh = data[0]+dh[i];
				int nx = data[1]+dx[i];
				int ny = data[2]+dy[i];
				if(nh>=0&&nh<h&&nx>=0&&nx<n&&ny>=0&&ny<m&&arr[nh][nx][ny] == 0) {
					arr[nh][nx][ny] = arr[data[0]][data[1]][data[2]] + 1;
					que.add(new int[] {nh,nx,ny});
				}
			}
			
		}
		
		int cnt = 0;
		for(int z=0;z<h;z++) {
			for(int i=0;i<n; i++) {
				for(int j=0;j<m;j++) {
					if(arr[z][i][j] == 0) {
						System.out.println(-1);
						return;
					}else {
						cnt = Math.max(cnt, arr[z][i][j]);
					}
				}
			}
		}
		
		System.out.println(cnt-1);
		
	
	}

}
