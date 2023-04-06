package 오답1;
import java.util.*;
public class 전력망나누기 {
	static int[][] data;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) {
		int n = 4;
		int[][] wires = {{1,2},{2,3},{3,4}};
		
		data = new int[n+1][n+1];
		for(int i=0; i<wires.length; i++) {
			data[wires[i][0]][wires[i][1]] = 1;
			data[wires[i][1]][wires[i][0]] = 1;
		}
		
		for(int i=0; i<wires.length; i++) {
			data[wires[i][0]][wires[i][1]] = 0;
			data[wires[i][1]][wires[i][0]] = 0;
			
			ans = Math.min(ans, bfs(n,wires[i][0]));
			
			data[wires[i][0]][wires[i][1]]= 1;
			data[wires[i][1]][wires[i][0]] = 1;
		}
		System.out.println(ans);

	}
	static private int bfs(int n, int start) {
		boolean[] vis = new boolean[n+1];
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		
		int cnt =1;
		while(!que.isEmpty()) {
			int a = que.poll();
			vis[a] = true;
			for(int i=1; i<=n ; i++) {
				if(vis[i]) continue;
				if(data[a][i] == 1) {
					cnt +=1;
					que.add(i);
				}
			}
		}
		
		return Math.abs(n-cnt*2);
	}

}
