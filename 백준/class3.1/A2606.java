package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2606 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		List<Integer>[] list = new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		boolean[] vis = new boolean[n+1];
		vis[1] = true;
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		int cnt = 0;
		
		while(!que.isEmpty()) {
			int num = que.poll();
			for(int i=0; i<list[num].size(); i++) {
				int num2 = list[num].get(i);
				if(!vis[num2]) {
					vis[num2] = true;
					que.add(num2);
					cnt +=1;
				}
			}
		}
		System.out.println(cnt);
	}

}
