package leve2;
import java.util.*;
public class A무인도여행 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static boolean[][] vis;
	static char[][] map;
	static List<Integer> list = new ArrayList<>();
	static int n;
	static int m;
	public static void main(String[] args) {
		String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
		
		n = maps.length;
		m = maps[0].length();
		vis = new boolean[maps.length][maps[0].length()];
		map = new char[maps.length][maps[0].length()];
		for(int i=0; i<maps.length; i++) {
			map[i] = maps[i].toCharArray();
		}
		
		for(int i=0; i<maps.length; i++) {
			for(int j=0; j<maps[i].length(); j++) {
				if(!vis[i][j] && map[i][j] !='X') {
					int sum = func(i,j);
					list.add(sum);
				}
			}
		}
		int[] ans = new int[list.size()];
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		if(list.size()==0) {
			ans = new int[] {-1};
		}
		
		System.out.println(Arrays.toString(ans));
	}
	private static int func(int x, int y) {
		int sum = 0;
		vis[x][y] = true;
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		while(!que.isEmpty()) {
			int[] data = que.poll();
			sum += (map[data[0]][data[1]]-'0');
			for(int i=0; i<4; i++) {
				int nx = data[0] + dx[i];
				int ny = data[1] + dy[i];
				
				if(nx>=0&& nx<n && ny>=0&&ny<m && !vis[nx][ny] && map[nx][ny] != 'X') {
					vis[nx][ny] = true;
					
					que.add(new int[] {nx,ny});
				}
			}
		}
	
		
		return sum;
	}
}
