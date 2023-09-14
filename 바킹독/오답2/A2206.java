package 오답2;

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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m];
		vis = new boolean[n][m][2];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(new int[] {0,0,1,0});
		vis[0][0][0] = true;
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
//			System.out.printf("%d %d\n", data[0],data[1]);
			if(data[0]==n-1 && data[1] == m-1) {
				System.out.println(data[2]);
				return;
			}
			for(int i=0; i<4; i++) {
				int nx = data[0]+dx[i];
				int ny = data[1]+dy[i];
				
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				
				//벽을만날때
				if(arr[nx][ny] == '1' && !vis[nx][ny][1] && data[3] == 0) {
					vis[nx][ny][1] = true;
//					System.out.printf("%d %d %d\n",1, nx,ny);
					que.add(new int[] {nx,ny,data[2]+1,1});
				}
				//벽이 아닐때
				if(arr[nx][ny] == '0' && !vis[nx][ny][data[3]]) {
					vis[nx][ny][data[3]] = true;
//					System.out.printf("%d %d %d\n",2, nx,ny);
					que.add(new int[] {nx,ny,data[2]+1,data[3]});
				}
			}
		}
		System.out.println(-1);
		
	}

}
