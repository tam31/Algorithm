package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A7569 {
	static int[] dx = {-1,0,1,0,0,0};
	static int[] dy = {0,-1,0,1,0,0};
	static int[] dh = {0,0,0,0,-1,1};
	static int ans = 0;
	static int n;
	static int m;
	static int h;
	static int[][][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
	
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
			int[] a = que.poll();
			for(int i=0; i<6; i++) {
				int nx = dx[i]+a[1];
				int ny = dy[i]+a[2];
				int nh = dh[i]+a[0];
				
				if(nx>=0&&nx<n && ny>=0&&ny<m && nh>=0&&nh<h && map[nh][nx][ny]==0) {
					map[nh][nx][ny] = map[a[0]][a[1]][a[2]]+1;
					que.add(new int[] {nh,nx,ny});
				}
			}
		}
		
		
		if(!check()) {
			System.out.println(-1);
		}else {
			System.out.println(ans-1);
		}
		
	}
	static boolean check() {
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(map[k][i][j]==0) {
						return false;
					}else {
						ans = Math.max(ans, map[k][i][j]);
					}
				}
			}
		}
		return true;
	}
}
