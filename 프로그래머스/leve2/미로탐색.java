package leve2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[n][m];
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		int[][] arr = new int[n][m];
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0,0});
		arr[0][0] = 1;
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int i=0; i<4; i++) {
				int nx = data[0] + dx[i];
				int ny = data[1] + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 &&ny<m && map[nx][ny] == '1' && arr[nx][ny] == 0) {
					que.add(new int[] {nx,ny});
					arr[nx][ny] = arr[data[0]][data[1]] +1;
				}
			}
		}
		System.out.println(arr[n-1][m-1]);
		
	}

}
