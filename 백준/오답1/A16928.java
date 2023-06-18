package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A16928 {
	static int map[];
	static int[] vis;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[101];
		vis = new int[101];
		Arrays.fill(map, -1);
		map[1] = 0;
		
		for(int i=0; i<m+n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a] = b;
		}
		
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		while(!que.isEmpty() && vis[100]==0) {
			int a = que.poll();
			
			for(int i=1; i<=6; i++) {
				int now = a+i;
				if(now>100) continue;
				
				if(map[now]==-1 && vis[now] ==0) {
					vis[now] = vis[a]+1;
					que.add(now);
				}
				
				if(map[now] != -1 && vis[map[now]] == 0) {
					vis[map[now]] = vis[a]+1;
					vis[now] = vis[a]+1;
					que.add(map[now]);
				}
			}
		}
		
		System.out.println(vis[100]);
	}

}
