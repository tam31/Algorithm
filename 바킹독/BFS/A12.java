package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class A12 {
	static int n;
	static char[][] arr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new char[n][n];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == '1') {
					cnt +=1;
					int num = dfs(i,j);
					list.add(num);
				}
			}
		}
		
		System.out.println(cnt);
		Collections.sort(list);
		for(int k:list) {
			System.out.println(k);
		}
		
	}
	private static int dfs(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {i,j});
		arr[i][j] = '0';
		
		int cnt = 1;
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int k=0; k<4; k++) {
				int nx = data[0] + dx[k];
				int ny = data[1] + dy[k];
				if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] == '1') {
					arr[nx][ny] = '0';
					que.add(new int[] {nx,ny});
					cnt +=1;
				}
			}
		}
		return cnt;
	}

}
