package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1697 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] vis = new int[100001];
		Arrays.fill(vis, -1);
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {n,0});
		vis[n] = 0;
		
		int max = Math.max(n, m);
		
		int ans = -1;
		while(!que.isEmpty()) {
			int[] data = que.poll();
			
			if(data[0] == m) {
				ans = data[1];
				break;
			}
			if(data[0]+1<=100000 && vis[data[0]+1]==-1) {
				que.add(new int[] {data[0]+1, data[1]+1});
				vis[data[0]+1] = vis[data[0]]+1;
			}
			if(data[0]-1>=0 && vis[data[0]-1] == -1) {
				que.add(new int[] {data[0]-1, data[1]+1});
				vis[data[0]-1] = vis[data[0]]+1;
			}
			if(data[0]*2<=100000 && vis[data[0]*2] == -1) {
				que.add(new int[] {data[0]*2, data[1]+1});
				vis[data[0]*2] = vis[data[0]] +1;
			}
				
		
			
		}
		System.out.println(ans);
		
	}

}
