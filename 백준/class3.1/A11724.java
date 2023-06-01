package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11724 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<Integer>[] list = new ArrayList[n+1];
		boolean[] vis = new boolean[n+1];
		for(int i=0; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
			
		}
		
		int cnt =0;
		for(int i=1; i<=n; i++) {
			if(!vis[i]) {
				cnt +=1;
				vis[i] = true;
				Queue<Integer> que = new LinkedList<>();
				que.add(i);
				
				while(!que.isEmpty()) {
					int a = que.poll();
					for(int j=0; j<list[a].size(); j++) {
						int b = list[a].get(j);
						if(!vis[b]) {
							que.add(b);
							vis[b]= true;
						}
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
