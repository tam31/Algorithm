package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A10 {
	static int n;
	static int m;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] vis;
	static int[][] vis2;
	static char[][] arr;
	static Queue<int[]> que2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int nums = Integer.parseInt(br.readLine());
		for(int num=0; num<nums; num++) {
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			arr = new char[n][m];
			vis = new int[n][m];
			vis2 = new int[n][m];
			for(int i=0; i<n; i++) {
				Arrays.fill(vis[i], -1);
				Arrays.fill(vis2[i], -1);
			}
			
			Queue<int[]> que = new LinkedList<int[]>();
			que2 = new LinkedList<>();
			
			for(int i=0; i<n; i++) {
				arr[i] = br.readLine().toCharArray();
				for(int j=0; j<m; j++) {
					if(arr[i][j] == '*') {
						vis[i][j] = 0;
						que.add(new int[] {i,j});
					}
					if(arr[i][j] == '@') {
						vis2[i][j] = 0;
						que2.add(new int[] {i,j});
					}
				}
			}
			while(!que.isEmpty()) {
				int[] data = que.poll();
				for(int i=0; i<4; i++) {
					int nx = data[0] + dx[i];
					int ny = data[1] + dy[i];
					if(nx>=0&&nx<n&&ny>=0&&ny<m&&arr[nx][ny]=='.'&&vis[nx][ny] == -1) {
	//					System.out.printf("%d %d\n",nx,ny);
						vis[nx][ny] = vis[data[0]][data[1]] + 1;
						que.add(new int[] {nx,ny});
					}
				}
			}
			int check = check();
			if(check ==0) {
	//		System.out.println(Arrays.deepToString(vis2));
			sb.append("IMPOSSIBLE"+"\n");
			}else{
				sb.append(check+"\n");
			}
		}
		System.out.println(sb);
		
	}
	private static int check() {
		while(!que2.isEmpty()) {
			int[] data = que2.poll();
			for(int i=0; i<4; i++) {
				int nx = data[0] + dx[i];
				int ny = data[1] + dy[i];
				if(nx<0||nx>=n||ny<0||ny>=m) {
//					System.out.println("여기");
//					System.out.println(vis2[data[0]][data[1]]+1);
					return vis2[data[0]][data[1]]+1;
				}
				
				if(arr[nx][ny] !='.' || vis2[nx][ny] !=-1) continue;
				if(vis[nx][ny] != -1 && vis[nx][ny] <= vis2[data[0]][data[1]] + 1) continue;
				
				vis2[nx][ny] = vis2[data[0]][data[1]]+1;
				que2.add(new int[] {nx,ny});
			}
		}
		return 0;
	}

}
