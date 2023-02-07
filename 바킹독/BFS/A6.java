package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A6 {
	static int n;
	static int m;
	static int k;
	static int[][] arr;
	static int[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		for(int num = 0; num<nums; num++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			arr = new int[n][m];
			
			for(int i=0; i<k; i++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}
	//		System.out.println(Arrays.deepToString(arr));
			int cnt = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(arr[i][j] == 1) {
						bfs(i,j);
						cnt +=1;
					}
				}
			}
			
			System.out.println(cnt);
		
		
		}
	}

	private static void bfs(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		arr[i][j] = -1;
		
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int z=0; z<4; z++) {
				int nx = point[0] + dx[z];
				int ny = point[1] + dy[z];
//				System.out.printf("%d %d\n",nx,ny);
				if(nx>=0 && nx<n && ny>=0 && ny<m) {
//					System.out.println(11);
//					System.out.printf("%d %d\n",nx,ny);
					if(arr[nx][ny] == 1) {
						que.add(new int[] {nx,ny});
						arr[nx][ny] = -1;
					}
					
					
				}
			}
		}
		
	}

}
