package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1520 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int map[][] = new int[n][m];
		int count[][] = new int[n][m];
		boolean[][] vis = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		PriorityQueue<int[]> que = new PriorityQueue<>((o1,o2)->{
			return o2[2]-o1[2];
		});
		
		count[0][0] = 1;
		que.add(new int[] {0,0,map[0][0]});
		while(!que.isEmpty()) {
			int[] a = que.poll();
			
			for(int i=0; i<4; i++) {
				int nx = dx[i]+a[0];
				int ny = dy[i]+a[1];
				if(nx>=0&&nx<n && ny>=0&&ny<m && map[nx][ny] < a[2]) {
					count[nx][ny] += count[a[0]][a[1]];
					if(!vis[nx][ny]) {
						que.add(new int[] {nx,ny, map[nx][ny]});
						vis[nx][ny] = true;
					}
					
					
					
					
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%d ", count[i][j]);
			}
			System.out.println();
		}
		System.out.println(count[n-1][m-1]);
	}

}
