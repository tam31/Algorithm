package leve2;
import java.util.*;
public class A전력망을둘로나누기 {
	static int[][] map;
	public static void main(String[] args) {
		int n = 9;
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		
		int m = wires.length;
		int ans = n;
		map = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			map[wires[i][0]][wires[i][1]]= 1;
			map[wires[i][1]][wires[i][0]]= 1;
		}
		
		for(int i=0; i<m; i++) {
			map[wires[i][0]][wires[i][1]]= 0;
			map[wires[i][1]][wires[i][0]]= 0;
			
			ans = Math.min(ans, func(n, wires[i][0]));
			
			map[wires[i][0]][wires[i][1]]= 1;
			map[wires[i][1]][wires[i][0]]= 1;
		}
		
		System.out.println(ans);
	
	}
	private static int func(int n, int num) {
		boolean[] vis = new boolean[n+1];
		
		Queue<Integer> que = new LinkedList<>();
		que.add(num);
		int cnt = 1;
		
		while(!que.isEmpty()) {
			int a = que.poll();
			vis[a] = true;
			
			for(int i=1; i<=n; i++) {
				if(!vis[i] && map[a][i] == 1) {
					que.add(i);
					cnt +=1;
				}
			}
		}
		
		return Math.abs(n-2*cnt);
		
	}
}
