package leve2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) {
		int[][] map = 
				{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
	
		int[][] dis = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(map[i][j] == 0) {
					dis[i][j] = -1;
				}
			}
		}
		
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(new int[] {0,0});
		dis[0][0] = 1;
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			for(int i=0; i<4; i++) {
				int nx = dx[i]+data[0];
				int ny = dy[i]+data[1];
				
				if(nx>=0&&nx<5&&ny>=0&&ny<5 && dis[nx][ny] == 0) {
					dis[nx][ny] = dis[data[0]][data[1]] +1;
					que.add(new int[] {nx,ny});
				}
			}
		}
		
		if(dis[4][4] == 0) {
			System.out.println(-1);
		}else {
			System.out.println(dis[4][4]);
		}
		
		
	}

}
