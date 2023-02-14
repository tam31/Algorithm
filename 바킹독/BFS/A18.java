package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A18 {
	static int n;
	static int m;
	static int[][] arr;
	static int[][] vis;
	static int[][] zero;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		vis = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int year = 0;
		
		while(true) {
			year +=1;
			melting();
			initvis();
			int check = status();
			if(check == 0) {
				System.out.println(0);
				return;
			}
			else if(check==1) continue;
			else break;
		}
		System.out.println(year);
	}
	//빙산상태 확인
	private static int status() {
		int x= -1;
		int y = -1;
		int cnt1 = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] != 0) {
					x = i;
					y = j;
					cnt1 +=1;
				}
			}
		}
		if(cnt1==0) return 0;
		int cnt2 = 0;
		Queue<int[]> que = new LinkedList<>();
		vis[x][y] = 1;
		que.add(new int[] {x,y});
		while(!que.isEmpty()) {
			int[] data = que.poll();
			cnt2 +=1;
			for(int i=0; i<4; i++) {
				int nx = data[0]+dx[i];
				int ny = data[1]+dy[i];
				if(nx<0||nx>=n||ny<0||ny>=m||vis[nx][ny] == 1||arr[nx][ny] <=0) continue;
				vis[nx][ny] = 1;
				que.add(new int[] {nx,ny});
			}
		}
		if(cnt1==cnt2) return 1;
		return 2;
	}

	private static void initvis() {
		for(int i=0; i<n; i++) {
			Arrays.fill(vis[i], 0);
		}
		
	}

	//1년의 시간 흐름
	public static void melting() {
		zero = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0) continue;
				for(int k = 0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0&&nx<n&&ny>=0&&ny<m&&arr[nx][ny] == 0) zero[i][j] +=1;
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = Math.max(0, arr[i][j] - zero[i][j]);
			}
		}
//		System.out.println(Arrays.deepToString(zero));
	}
	
}
