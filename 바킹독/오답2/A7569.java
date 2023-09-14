package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A7569 {
	static int n;
	static int m;
	static int h;
	static int[] dh = {1,-1,0,0,0,0};
	static int[] dx = {0,0,1,-1,0,0};
	static int[] dy = {0,0,0,0,1,-1};
	static int[][][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		arr = new int[h][n][m];
		Queue<int[]> que = new LinkedList<>();
		
		
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					arr[k][i][j] = Integer.parseInt(st.nextToken());
					if(arr[k][i][j] == 1) {
						que.add(new int[] {k,i,j});
					}
				}
			}
		}
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int i=0; i<6; i++) {
				int nh = data[0] + dh[i];
				int nx = data[1] + dx[i];
				int ny = data[2] + dy[i];
				if(nh>=0&&nh<h&&nx>=0&&nx<n&&ny>=0&&ny<m&&arr[nh][nx][ny] == 0) {
					que.add(new int[] {nh,nx,ny});
					arr[nh][nx][ny] = arr[data[0]][data[1]][data[2]] + 1;
				}
			}
		}
		
		int cnt = 0;
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(arr[k][i][j] == 0) {
						System.out.println(-1);
						return;
					}
					cnt = Math.max(cnt, arr[k][i][j]);
				}
			}
		}
		
		System.out.println(cnt-1);
		
		
		
	}

}
