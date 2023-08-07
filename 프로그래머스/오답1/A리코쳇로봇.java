package 오답1;
import java.util.*;
public class A리코쳇로봇 {
	static int n;
	static int m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static char[][] map;
	static boolean[][] vis;
	static int ans = -1;
	public static void main(String[] args) {
		String[] board = {".D.R", "....", ".G..", "...D"};
		
		n = board.length;
		m = board[0].length();
		vis = new boolean[n][m];
		map = new char[n][m];
		for(int i=0; i<n; i++) {
			map[i] = board[i].toCharArray();
		}
		
		func();
		System.out.println(ans);
	}
	private static void func() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 'R') {
					vis[i][j] = true;
					Queue<int[]> que = new LinkedList<>();
					que.add(new int[] {i,j,0});
					
					while(!que.isEmpty()) {
						int[] q = que.poll();
						
						for(int k=0; k<4; k++) {
							int nx = q[0];
							int ny = q[1];
							
							while(true) {
								if(nx<0||nx>=n||ny<0||ny>=m) {
									nx -= dx[k];
									ny -= dy[k];
									break;
								}
								
								if(map[nx][ny] =='D') {
									nx -= dx[k];
									ny -= dy[k];
									break; 
								}
								
								nx += dx[k];
								ny += dy[k];
							}
//							System.out.println(nx+" "+ny);
							if(vis[nx][ny]) continue;
							if(map[nx][ny]=='G') {
								ans = q[2]+1;
								return;
							}
							System.out.println(nx+" "+ny);
							vis[nx][ny]=true;
							que.add(new int[] {nx,ny,q[2]+1});
						}
					}
				}
			}
		}
	}
}
