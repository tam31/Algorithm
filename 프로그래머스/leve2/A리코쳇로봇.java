package leve2;
import java.util.*;
public class A리코쳇로봇 {
	static int n;
	static int m;
	static char[][] map;
	static boolean[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) {
		String[] board = {".D.R", "....", ".G..", "...D"};
		
		n = board.length;
		m = board[0].length();
		map = new char[n][m];
		vis = new boolean[n][m];
		for(int i=0; i<n; i++) {
			map[i] = board[i].toCharArray();
		}
		
		int[] start = new int[2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 'R') {
					start[0] = i;
					start[1] = j;
					vis[i][j] = true;
				}
			}
		}
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {start[0],start[1],0});
	
		while(!que.isEmpty()) {
			int[] a = que.poll();
//			System.out.println(Arrays.toString(a));
			for(int i=0; i<4; i++) {
				int nx = a[0];
				int ny = a[1];
				
				while(true) {
					if(nx<0||nx>=n || ny<0||ny>=m) {
						break;
					}
					
					if(map[nx][ny] == 'D') {
						nx -= dx[i];
						ny -= dy[i];
						break;
					}
					
					nx+=dx[i];
					ny+=dy[i];
				}
				
				if(nx<0||nx>=n || ny<0||ny>=m) {
					nx -=dx[i];
					ny -=dy[i];
				}
//				System.out.println(nx+" "+ny);
				if(map[nx][ny] == 'G') {
					System.out.println(a[2]+1);
					break;
				}
				
				if(!vis[nx][ny]) {
					que.add(new int[] {nx,ny,a[2]+1});
					vis[nx][ny] = true;
				}
			}
		}
		System.out.println(-1);
	}

}
