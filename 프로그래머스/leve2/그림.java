package leve2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] data = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int now=1;
		int maxCnt = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(data[i][j] == 1) {
					int cnt1 = 1;
					now +=1;
					Queue<int[]> que = new LinkedList<>();
					que.add(new int[] {i,j});
					data[i][j] = now;
//					System.out.println(now);
					while(!que.isEmpty()) {
						int[] arr = que.poll();
						//System.out.printf("%d %d\n",arr[0],arr[1]);
						for(int k=0; k<4; k++) {
							int nx = arr[0] + dx[k];
							int ny = arr[1] + dy[k];
							if(nx>=0&&nx<n&&ny>=0&&ny<m&&data[nx][ny]==1) {
								data[nx][ny] = now;
								cnt1 +=1;
								que.add(new int[] {nx,ny});
							}
						}
					}
					maxCnt = Math.max(maxCnt, cnt1);
				}
			}
		}
		
//		System.out.println(Arrays.deepToString(data));
		System.out.println(now-1);
		System.out.println(maxCnt);
	}

}
