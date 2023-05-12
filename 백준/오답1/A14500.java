package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A14500 {
	static int n;
	static int m;
	static int[][] map;
	static boolean[][] vis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int ans = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		vis = new boolean[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!vis[i][j]) {
					vis[i][j] = true;
					func(i,j,map[i][j],1);
					vis[i][j] = false;
				}
			}
		}
		
		System.out.println(ans);
	}
	private static void func(int x, int y, int sum, int cnt) {
		if(cnt == 4) {
			ans = Math.max(sum, ans);
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nx = dx[i]+x;
			int ny = dy[i]+y;
			
			if(nx>=0&&nx<n && ny>=0&&ny<m && !vis[nx][ny]) {
				
				if(cnt==2) {
					vis[nx][ny]=true;
					func(x,y,sum+map[nx][ny],cnt+1);
					vis[nx][ny]=false;
				}
				
				vis[nx][ny] = true;
				func(nx,ny,sum+map[nx][ny],cnt+1);
				vis[nx][ny] = false;
			}
		}
	}
}
