package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A16928 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] vis = new int[101];
		int[] map = new int[101];
		
		Arrays.fill(vis, -1);
		vis[1] = 0;
		for(int i=0; i<n+m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a]=b;
		}
		
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		
		while(!que.isEmpty() && vis[100] == -1) {
			int a = que.poll();
			
			for(int i=0; i<=6; i++) {
				int now = a+i;
				
				if(now >100) {
					continue;
				}
				
				if(map[now] !=0 && vis[map[now]]==-1) {
					vis[map[now]] = vis[a] +1;
					vis[now] = vis[a]+1;
					que.add(map[now]);
				}
				
				if(map[now]==0 && vis[now]==-1) {
					vis[now] = vis[a]+1;
					que.add(now);
				}
			}
		}
		//System.out.println(Arrays.toString(vis));
		System.out.println(vis[100]);
	}

}
