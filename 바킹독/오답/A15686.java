package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class A15686 {
	static int n;
	static int m;
	static int[][] arr;
	static ArrayList<int[]> list1 = new ArrayList<>();
	static ArrayList<int[]> list2 = new ArrayList<>();
	static boolean[] vis;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					list1.add(new int[]{i,j});
				}else if(arr[i][j]==2) {
					list2.add(new int[]{i,j});
				}
			}
		}
		
		vis = new boolean[list2.size()];
		func(0,0);
		System.out.println(ans);
	}
	private static void func(int idx, int start) {
		if(idx == m) {
			int re = 0;
			for(int[] h:list1) {
				int re2 = Integer.MAX_VALUE;
				for(int i=0; i<list2.size(); i++) {
					if(vis[i]) {
						int sum = Math.abs(h[0]-list2.get(i)[0])+
								Math.abs(h[1]-list2.get(i)[1]);
						re2 = Math.min(sum, re2);
					}
				}
				re += re2;
			}
			ans = Math.min(ans, re);
			return;
		}
		
		for(int i=start; i<list2.size(); i++) {
			if(!vis[i]) {
				vis[i] = true;
				func(idx+1, i+1);
				vis[i] = false;
			}
		}
	}

}
