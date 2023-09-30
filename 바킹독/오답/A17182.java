package 플로이드.오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A17182 {
	static int[][] map;
	static boolean[] vis;
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
					if(i==j || k==i || k==j) continue;
					map[i][j] = Math.min(map[i][j], (map[i][k]+map[k][j]));
				}
			}
		}
		vis[m]=true;
		func(n,m,1,0);
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(ans);
	}
	private static void func(int n,int now,int cnt, int sum) {
		if(cnt==n) {
			ans = Math.min(sum, ans);
			return;
		}
//		System.out.println(sum+" "+cnt);
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				func(n,i,cnt+1,sum+map[now][i]);
				vis[i] = false;
			}
		}
	}
}
