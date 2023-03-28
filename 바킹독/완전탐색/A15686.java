package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A15686 {
	static int n;
	static int m;
	static int[][] map;
	static ArrayList<int[]> person=new ArrayList<>();
	static ArrayList<int[]> ch=new ArrayList<>();
	static boolean vis[];
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1) {
					person.add(new int[] {i,j});
				}else if(map[i][j] == 2) {
					ch.add(new int[] {i,j});
				}
			}
		}
		
		
		vis = new boolean[ch.size()];
		func(0,0);
		System.out.println(ans);
		
	}
	private static void func(int k,int start) {
		if(k==m) {
			int re = 0;
			for(int[] h :person) {
				int tmp = Integer.MAX_VALUE;
				for(int i=0; i<ch.size(); i++) {
					if(vis[i]) {
						int sum = Math.abs(h[0]-ch.get(i)[0]) +
								Math.abs(h[1]-ch.get(i)[1]);
						tmp = Math.min(sum, tmp);
					}
				
				}
				
				re += tmp;
			}
			ans = Math.min(ans, re);
			return;
		}
		
		for(int i=start; i<ch.size(); i++) {
			if(!vis[i]) {
				vis[i]= true;
				func(k+1, i+1);
				vis[i] = false;
			}
		}
	}

}
