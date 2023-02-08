package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A8 {
	static int n;
	static int m;
	static int h;
	static int[] dx = {0,0,1,-1,0,0};
	static int[] dy = {1,-1,0,0,0,0};
	static int[] dz = {0,0,0,0,1,-1};
	static int[][][] arr;
	static int[][][] vis;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		arr = new int[h][n][m];
		Queue<int[]>que = new LinkedList<>();
//		System.out.println(Arrays.deepToString(arr));
		
		for(int z=0; z<h; z++) {
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					arr[z][i][j] = Integer.parseInt(st.nextToken());
//					System.out.println(arr[z][i][j]);
					if(arr[z][i][j] == 1) {
						que.add(new int[] {z,i,j});
					}
				}
			}
		}
		
//		System.out.println(Arrays.deepToString(arr));
		
		
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int i=0; i<6; i++) {
				int nh = point[0] + dz[i];
				int nx = point[1] + dx[i];
				int ny = point[2] + dy[i];
				if(nx>=0 &&nx<n&&ny>=0&&ny<m&&nh>=0&&nh<h&&arr[nh][nx][ny] == 0) {
					que.add(new int[] {nh,nx,ny});
					arr[nh][nx][ny] = arr[point[0]][point[1]][point[2]] + 1;
				}
			}
		}
		
		ans();
		
		
	}
	private static void ans() {
		int cnt=0;
		for(int z=0; z<h; z++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(arr[z][i][j] == 0) {
						System.out.println(-1);
						return;
					}
					cnt = Math.max(cnt, arr[z][i][j]-1);
				}
			}
		}
		System.out.println(cnt);
		return;
	}

}
