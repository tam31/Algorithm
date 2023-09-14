package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2573 {
	static int n;
	static int m;
	static int[][] arr;
	static int[][] vis;
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
			later();
			zero();
			int num = check();
			if(num == 0) {
				System.out.println(0);
				return;
			}
			else if(num==1) continue;
			else break;
		}
		System.out.println(year);
	}
	private static int check() {
		int x = -1;
		int y = -1;
		int cnt1 = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] != 0) {
					x = i;
					y = j;
					cnt1 += 1;
				}
			}
		}
		if(cnt1 == 0) return 0;
		int cnt2 = 0;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		vis[x][y] = 1;
		while(!que.isEmpty()) {
			int[] data = que.poll();
			cnt2+=1;
			for(int i=0; i<4; i++) {
				int nx = data[0] + dx[i];
				int ny = data[1] + dy[i];
				
				if(nx<0||nx>=n||ny<0||ny>=m||vis[nx][ny] == 1||arr[nx][ny]<=0) continue;
				vis[nx][ny] =1;
				que.add(new int[] {nx,ny});
			}
		}
		if(cnt1==cnt2) return 1;
		return 2;
		
	}
	//방문횟수 초기화
	private static void zero() {
		for(int i=0; i<n; i++) {
			Arrays.fill(vis[i], 0);
		}
	}

	//1년후
	private static void later() {
		int[][] zero = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0) continue;
				
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					if(nx>=0&&nx<n&&ny>=0&&ny<m&&arr[nx][ny] == 0) zero[i][j] +=1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = Math.max(0, arr[i][j]-zero[i][j]);
			}
		}
		
	}

}
