package leve2;
import java.util.*;
public class A미로탈출 {
	static char[][] map;
	static boolean[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int n;
	static int m;
	static int ans = -1;
	public static void main(String[] args) {
		String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
	
		n = maps.length;
		m = maps[0].length();
		map = new char[n][m];
		for(int i=0; i<n; i++) {
			map[i] = maps[i].toCharArray();
		}
		int cnt1=0;
		int cnt2=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 'S') {
					cnt1 = func(i,j);
					if(cnt1 == -1) {
						// System.out.println(false);
//						return -1;
					}
				}
				
				if(map[i][j] == 'L') {
					cnt2 = func2(i,j);
					if(cnt2 == -1) {
						// System.out.println(false);
//						return -1;
					}
				}
			}
		}	
		System.out.println(cnt1+cnt2);
	}
	private static int func(int x, int y) {
		vis = new boolean[n][m];
		vis[x][y] = true;
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y,0});
		while(!que.isEmpty()) {
			int[] a = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = dx[i]+a[0];
				int ny = dy[i]+a[1];
				
				if(nx>=0&&nx<n && ny>=0&&ny<m && !vis[nx][ny]) {
					if(map[nx][ny] == 'O' || map[nx][ny] == 'E'){
                        que.add(new int[]{nx,ny,a[2]+1});
                        vis[nx][ny] = true;
                    }else if(map[nx][ny] == 'L'){
                        return a[2]+1;
                    }
				}
			}
		}
		return -1;
	}

	private static int func2(int x, int y) {
		vis = new boolean[n][m];
		vis[x][y] = true;
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y,0});
		while(!que.isEmpty()) {
			int[] a = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = dx[i]+a[0];
				int ny = dy[i]+a[1];
				
				if(nx>=0&&nx<n && ny>=0&&ny<m && !vis[nx][ny]) {
					if(map[nx][ny]=='E') {
						return a[2]+1;
					}else if(map[nx][ny] != 'X') {
						vis[nx][ny] = true;
						que.add(new int[] {nx,ny,a[2]+1});
					}
				}
			}
		}
		return -1;
	}
}