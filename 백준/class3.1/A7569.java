package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A7569 {
	static int[][][] map;
	static int[] dx = {-1,0,1,0,0,0};
	static int[] dy = {0,-1,0,1,0,0};
	static int[] dh = {0,0,0,0,-1,1};
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		Queue<int[]> que = new LinkedList<>();
		
		map = new int[h][n][m];
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<m; j++) {
					map[k][i][j] = Integer.parseInt(st.nextToken());
					if(map[k][i][j] == 1) {
						que.add(new int[] {k,i,j});
					}
				}
			}
		}
			
		while(!que.isEmpty()) {
			int[] data = que.poll();
			
			for(int t=0; t<6; t++) {
				int nh = data[0]+dh[t];
				int nx = data[1]+dx[t];
				int ny = data[2]+dy[t];
				
				if(nh>=0&&nh<h && nx>=0&& nx<n && ny>=0 && ny<m && map[nh][nx][ny]==0) {
					que.add(new int[] {nh,nx,ny});
					map[nh][nx][ny]=map[data[0]][data[1]][data[2]]+1;
					cnt = Math.max(cnt, map[nh][nx][ny]);
				}
			}
		}
					

		if(check(n,m,h)) {
			System.out.println(cnt-1);
		}else {
			System.out.println(-1);
		}
	}
	private static boolean check(int n, int m, int h) {
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(map[k][i][j]==0) {
						return false;
					}else {
						cnt = Math.max(cnt, map[k][i][j]);
					}
				}
			}
		}
		
		return true;
	}
}
