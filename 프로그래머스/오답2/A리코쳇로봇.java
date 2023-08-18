package 오답2;
import java.util.*;
public class A리코쳇로봇 {
	static int n;
	static int m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static char[][] map;
	static int[][] vis;
	static int ans = -1;
	public static void main(String[] args) {
		String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
		
		n = board.length;
		m = board[0].length();
		map = new char[n][m];
		vis = new int[n][m];
		
		for(int i=0; i<n; i++) {
			map[i] = board[i].toCharArray();
		}
		
		func();
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				System.out.print(vis[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(ans);
	}
	private static void func() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 'R') {
					func2(i,j);
					return;
				}
			}
		}
	}
	private static void func2(int x, int y) {
		vis[x][y] = 1;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty()) {
			int[] q = que.poll();

			for(int i=0; i<4; i++) {
				int nx = q[0];
				int ny = q[1];
				
				boolean check = true;
				while(true) {
					
					if(nx<0||nx>=n||ny<0||ny>=m) break;
					if(map[nx][ny] == 'D') break;
					
					nx += dx[i];
					ny += dy[i];
					
				}
				
				nx -= dx[i];
				ny -= dy[i];
				if(vis[nx][ny] == 0) {
//					System.out.println(nx+" "+ny);
					vis[nx][ny] = vis[q[0]][q[1]]+1;
					if(map[nx][ny]=='G') {
						ans = vis[nx][ny]-1;
						return;
					}
					que.add(new int[] {nx,ny});
				}
			}
		}
	}
}
