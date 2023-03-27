package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2468 {
	static int[][] map;
	static int[][] vis;
	static int n;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		int max = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, map[i][j]);
			}
		}
		int ans = 0;
		for(int i=0; i<=max; i++) {
			int a = dfs(i);
			ans = Math.max(ans, a);
		}
		System.out.println(ans);
	
	}

	private static int dfs(int m) {
		vis = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] >m) {
					vis[i][j] = 1;
				}
			}
		}
		
		int cnt = 0;
		Queue<int[]> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(vis[i][j] == 1) {
					cnt +=1;
					que.add(new int[] {i,j});
					vis[i][j] = 2;
					
					while(!que.isEmpty()) {
						int data[] = que.poll();
						for(int k=0; k<4; k++) {
							int nx = data[0]+dx[k];
							int ny = data[1]+dy[k];
							if(nx>=0&&nx<n&&ny>=0&&ny<n&&vis[nx][ny]==1) {
								que.add(new int[] {nx,ny});
								vis[nx][ny] = 2;
							}
						}
					}
				}
			}
		}
		
		return cnt;
	}
	

}
