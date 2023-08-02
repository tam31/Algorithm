package 오답1;
import java.util.*;
public class 리코쳇로봇 {
	static int n;
	static int m;
	static char[][] map;
	static boolean[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) {
		String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
		
		n = board.length;
		m = board[0].length();
		map = new char[n][m];
		vis = new boolean[n][m];
		Queue<int[]> que = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			map[i] = board[i].toCharArray();
			for(int j=0; j<m; j++) {
				if(map[i][j] =='R') {
					que.add(new int[] {i,j,0});
					vis[i][j] = true;
				}
			}
		}
		
		int ans = -1;
		while(!que.isEmpty()) {
			int[] q = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = q[0];
				int ny = q[1];
				
				while(true) {
					
					if(nx<0||nx>=n||ny<0||ny>=m) {
						break;
					}
					
					if(map[nx][ny] =='D') {
						nx -= dx[i];
						ny -= dy[i];
						break;
					}
					
					nx+=dx[i];
					ny+=dy[i];
					
				}
				
				if(nx<0||nx>=n||ny<0||ny>=m) {
					nx -= dx[i];
					ny -= dy[i];
				}
				
				if(map[nx][ny]=='G' && !vis[nx][ny]) {
					vis[nx][ny] = true;
					ans = q[2]+1;
					break;
				}
				
				if(!vis[nx][ny]) {
					vis[nx][ny] = true;
					que.add(new int[] {nx,ny,q[2]+1});
				}
			}
		}
		
		System.out.println(ans);
	}

}
