package 오답1;
import java.util.*;
public class A무인도여행 {
	static int n;
	static int m;
	static boolean[][] vis;
	static int[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) {
		String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
		
		n = maps.length;
		m = maps[0].length();
		vis = new boolean[n][m];
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(maps[i].charAt(j) != 'X') {
					map[i][j] = maps[i].charAt(j)-'0';
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] != 0 && !vis[i][j]) {
					int add = map[i][j];
					vis[i][j] = true;
					
					Queue<int[]> que = new LinkedList<>();
					que.add(new int[] {i,j});
					while(!que.isEmpty()) {
						int[] q = que.poll();
						for(int k=0; k<4; k++) {
							int nx = q[0]+dx[k];
							int ny = q[1]+dy[k];
							
							if(nx>=0&&nx<n && ny>=0&&ny<m && !vis[nx][ny] && map[nx][ny] !=0) {
								vis[nx][ny] = true;
								add += map[nx][ny];
								que.add(new int[] {nx,ny});
							}
						}
					}
					list.add(add);
				}
			}
		}
		Collections.sort(list);
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(ans));
	
	}

}
