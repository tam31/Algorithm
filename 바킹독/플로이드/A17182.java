package 플로이드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A17182 {
	static boolean[] vis;
	static int[][] map;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		vis = new boolean[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					map[i][j] = Math.min(map[i][j], (map[i][k]+map[k][j]));
				}
			}
		}
		
		vis[m]=true;
		func(m,0,0);
		System.out.println(ans);
	}
	private static void func(int now,int sum,int cnt) {
		if(cnt == map.length-1) {
			ans = Math.min(sum, ans);
			return;
		}
		
		for(int i=0; i<map.length; i++) {
			if(!vis[i] && now!=i) {
				vis[i] = true;
				func(i,sum+map[now][i],cnt+1);
				vis[i] = false;
			}
		}
	}
}
