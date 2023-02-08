package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A15 {
	static int h;
	static int n;
	static int m;
	static int[] dh = {0,0,0,0,1,-1};
	static int[] dx = {1,-1,0,0,0,0};
	static int[] dy = {0,0,1,-1,0,0};
	static char[][][] arr;
	static int[][][] vis; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {	
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			h = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			//if문
			if(h==0 && n==0&& m==0) {
				break;
			}
			arr = new char[h][n][m];
			vis = new int[h][n][m];
			Queue<int[]> que = new LinkedList<>();
			for(int k=0; k<h; k++) {
				for(int i=0; i<n; i++) {
					arr[k][i] = br.readLine().toCharArray();
	//				System.out.println(Arrays.toString(arr[k][i]));
					for(int j=0; j<m; j++) {
						if(arr[k][i][j] == 'S') {
							que.add(new int[]{k,i,j});
							vis[k][i][j] = 1;
						}
					}
				}
				br.readLine();
			}
			
			boolean ans = false;
			int cnt = 0;
			while(!que.isEmpty()) {
				int[] data = que.poll();
				if(arr[data[0]][data[1]][data[2]] == 'E') {
					ans = true;
					cnt = vis[data[0]][data[1]][data[2]]-1;
					break;
				}
				for(int k=0; k<6; k++) {
					int nh = data[0] + dh[k];
					int nx = data[1] + dx[k];
					int ny = data[2] + dy[k];
					if(nh>=0 && nh<h&&nx>=0&&nx<n&&ny>=0&&ny<m&& vis[nh][nx][ny] == 0 && (arr[nh][nx][ny]=='.' ||arr[nh][nx][ny]=='E')) {
						vis[nh][nx][ny] = vis[data[0]][data[1]][data[2]] + 1;
						que.add(new int[] {nh,nx,ny});
					}
				}
			}
			
			if(ans) {
				System.out.printf("Escaped in %d minute(s).\n", cnt);
			}else {
				System.out.println("Trapped!");
			}
		}
		
//		for(int k=0; k<h; k++) {
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<m; j++) {
//					System.out.printf("%s ",vis[k][i][j]);
//				}
//				System.out.println();
//			}
//		}
	}

}
