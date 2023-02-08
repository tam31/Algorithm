package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A9 {
	static int n;
	static int[] dx = {-1,-2,-2,-1,1,2,2,1};
	static int[] dy = {-2,-1,1,2,-2,-1,1,2};
	static int[][] arr;
	static int w_x;
	static int w_y;
	static Queue<int[]> que;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		for(int num=0; num<nums; num++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			
			que = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			que.add(new int[] {x,y});
			
			st = new StringTokenizer(br.readLine());
			
			w_x = Integer.parseInt(st.nextToken());
			w_y = Integer.parseInt(st.nextToken());
			
			int cnt=0;
			if(w_x==x && w_y == y) {
				System.out.println(cnt);
			}else {
				bfs();
			}
		
		}
	}
	private static void bfs() {
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int k=0; k<8; k++) {
				int nx = point[0] + dx[k];
				int ny = point[1] + dy[k];
				
				if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] == 0) {
//						System.out.printf("%d %d %d\n",nx,ny, arr[nx][ny]);
					que.add(new int[] {nx,ny});
					arr[nx][ny] = arr[point[0]][point[1]] + 1;
					
					if(nx==w_x && ny==w_y) {
						System.out.println(arr[nx][ny]);
						return;
					}
				}
			}
		}
		
	}

}
