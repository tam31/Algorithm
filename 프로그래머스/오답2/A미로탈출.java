package 오답2;
import java.util.*;
public class A미로탈출 {
	static int n;
	static int m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static char[][] maps;
	static int[][] vis;
	static int ans = 0;
	public static void main(String[] args) {
		String[] map = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
		
		n = map.length;
		m = map[0].length();
		maps = new char[n][m];
		
		for(int i=0; i<n; i++) {
			maps[i] = map[i].toCharArray();
		}
		
		if(func('S','L')) {
			if(func('L','E')) {
				System.out.println(ans);
			}else {
				System.out.println("false");
			}
		}else {
			System.out.println("false");
		}
		
	}
	private static boolean func(char a, char b) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(maps[i][j]==a) {
					if(func2(i,j,b)) {
						return true;
					}
					return false;
				}
			}
		}
		
		return false;
	}
	
	private static boolean func2(int x, int y, char b) {
		vis = new int[n][m];
		vis[x][y] = ans;
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		while(!que.isEmpty()) {
			int[] q = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = q[0]+dx[i];
				int ny = q[1]+dy[i];
				
				if(nx>=0&&nx<n && ny>=0&&ny<m && maps[nx][ny]!='X' && vis[nx][ny]==0) {
					vis[nx][ny] = vis[q[0]][q[1]]+1;
					if(maps[nx][ny]==b) {
						ans = vis[nx][ny];
						return true;
					}
					que.add(new int[] {nx,ny});
				}
			}
		}
		return false;
	}
}
