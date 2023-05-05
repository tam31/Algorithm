package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1389 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<Integer>[] list = new ArrayList[n+1];
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
		int cnt = Integer.MAX_VALUE;
		int ans = 0;
		for(int i=1; i<=n; i++) {
			int vis[] = new int[n+1];
			Queue<Integer> que = new LinkedList<>();
			que.add(i);
			
			int sum = 0;
			while(!que.isEmpty()) {
				int num = que.poll();
				for(int j=0; j<list[num].size(); j++) {
					int a = list[num].get(j);
					if(a!=i && vis[a]==0) {
						vis[a] = vis[num]+1;
						que.add(a);
					}
				}
			}
			for(int j=1; j<=n; j++) {
				sum += vis[j];
			}
			
			if(cnt>sum) {
				cnt = sum;
				ans = i;
			}
		}
		System.out.println(ans);
	}

}
