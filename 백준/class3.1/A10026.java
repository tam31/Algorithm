package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A10026 {
	//static boolean[][] vis1;
	//static boolean[][] vis2;
	static int n;
	static int cnt1 = 0;
	static int cnt2 = 0;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		char[][] map = new char[n][n];
		char[][] map2 = new char[n][n];
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]=='R') {
					map2[i][j]= 'G';
				}else {
					map2[i][j] = map[i][j];
				}
			}
		}
		
		boolean[][] vis1 = new boolean[n][n];
		boolean[][] vis2 = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!vis1[i][j]) {
					func(i,j, map,vis1);
					cnt1 +=1;
					
				}
				if(!vis2[i][j]) {
					func(i,j, map2,vis2);
					cnt2 +=1;
				}
			}
		}
		System.out.println(cnt1);
		System.out.println(cnt2);
		
	}
	private static void func(int x, int y, char[][] map, boolean vis[][]) {
		char a = map[x][y];
		vis[x][y] = true;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty()) {
			int data[] = que.poll();
			for(int i=0; i<4; i++) {
				int nx = data[0]+dx[i];
				int ny = data[1]+dy[i];
				
				if(nx>=0&&nx<n && ny>=0&&ny<n && !vis[nx][ny] && map[nx][ny] == a) {
					que.add(new int[] {nx,ny});
					vis[nx][ny] = true;
				}
			}
		}
	}
}
