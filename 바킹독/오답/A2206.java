package 오답;

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
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static char[][] arr;
	static boolean[][][] vis;
	static Queue<int[]> que;
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
		
		que = new LinkedList<>();
		que.add(new int[] {0,0,1,0});
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			
			if(data[0] == n-1 && data[1] == m-1) {
				System.out.println(data[2]);
				return;
			}
			for(int i=0; i<4; i++) {
				int nx = dx[i]+data[0];
				int ny = dy[i]+data[1];
				
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				
				//벽을 부순적이 없음
//				System.out.printf("%d %d\n",nx,ny);
				if(arr[nx][ny] == '0' && data[3] == 0 && !vis[nx][ny][0]) {
					que.add(new int[] {nx,ny,data[2]+1,0});
					vis[nx][ny][0] = true;
//					System.out.println(1);
				}else if(arr[nx][ny] == '0' && data[3] == 1 && !vis[nx][ny][1]) {
					que.add(new int[] {nx,ny,data[2]+1,1});
					vis[nx][ny][1] = true;
//					System.out.println(2);
				}
				
//				System.out.println(Arrays.toString(data));
				if(arr[nx][ny] == '1' && data[3] == 0) {
					que.add(new int[] {nx,ny,data[2]+1,1});
					vis[nx][ny][1] = true;
//					System.out.println(3);
				}
				
			}
		}
		System.out.println(-1);
	}

}
