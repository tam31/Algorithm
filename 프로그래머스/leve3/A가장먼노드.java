package leve3;
import java.util.*;
public class A가장먼노드 {

	public static void main(String[] args) {
		int n = 6;
		int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
	
		boolean[] vis = new boolean[n+1];
		List<Integer> list[] = new ArrayList[n+1];
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		for(int[] tmp: vertex) {
			list[tmp[0]].add(tmp[1]);
			list[tmp[1]].add(tmp[0]);
		}
		
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(new int[] {1,0});
		vis[1] = true;
		int max = 0;
		int cnt = 0;
		
		while(!que.isEmpty()) {
			int[] q = que.poll();
//			System.out.println(Arrays.toString(q));
			if(max == q[1]) {
				cnt +=1;
			}else if(max<q[1]) {
//				System.out.println(q[0]+" "+q[1]);
				max = q[1];
				cnt =1;
			}
			
			for(int i=0; i<list[q[0]].size(); i++) {
				int next = list[q[0]].get(i);
				if(!vis[next]) {
//					System.out.println(next);
					vis[next] = true;
					que.add(new int[] {next, q[1]+1});
				}
			}
		}
		
		System.out.println(cnt);
	}

}
