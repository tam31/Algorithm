package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A7576 {
	static int[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		Queue<int[]> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) {
					que.add(new int[] {i,j});
				}
			}
		}
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = dx[i]+data[0];
				int ny = dy[i]+data[1];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<m&&map[nx][ny]==0) {
					que.add(new int[] {nx,ny});
					map[nx][ny] = map[data[0]][data[1]]+1;
				}
			}
		}
		
		
		if(check(n,m)) {
			System.out.println(cnt-1);
		}else {
			System.out.println(-1);
		}
		
	}
	private static boolean check(int x, int y) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if(map[i][j]==0) {
					return false;
				}else {
					cnt = Math.max(cnt, map[i][j]);
				}
			}
		}
		return true;
	}
}

