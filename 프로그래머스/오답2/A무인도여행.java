package 오답2;
import java.util.*;
public class A무인도여행 {
	static int n;
	static int m;
	static char[][] map;
	static boolean[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
		
		n = maps.length;
		m = maps[0].length();
		map = new char[n][m];
		vis = new boolean[n][m];
		for(int i=0; i<n; i++) {
			map[i] = maps[i].toCharArray();
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!vis[i][j] && map[i][j] != 'X') {
					func(i,j);
				}
			}
		}
		int[] ans = new int[list.size()];
		if(list.size()==0) {
			ans = new int[] {-1};
		}else {
			for(int i=0; i<list.size(); i++) {
				ans[i] = list.get(i);
			}
		}
		
		System.out.println(list);
	}
	private static void func(int x, int y) {
		int sum = map[x][y]-'0';
		vis[x][y] = true;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty()) {
			int[] q = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = q[0]+dx[i];
				int ny = q[1]+dy[i];
				
				if(nx>=0&&nx<n && ny>=0&&ny<m && !vis[nx][ny] && map[nx][ny] !='X') {
					vis[nx][ny] =true;
					sum += (map[nx][ny]-'0');
					que.add(new int[] {nx,ny});
				}
			}
		}
		System.out.println(sum);
		list.add(sum);
	}
}
