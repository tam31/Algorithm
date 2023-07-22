package 오답1;
import java.util.*;
public class A전력망을둘로나누기 {
	static int[][] map;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		int n = 9;
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
	
		map = new int[n+1][n+1];
		for(int i=0; i<wires.length; i++) {
			map[wires[i][0]][wires[i][1]] = 1;
			map[wires[i][1]][wires[i][0]] = 1;
		}
		
		for(int i=0; i<wires.length; i++) {
			map[wires[i][0]][wires[i][1]] = 0;
			map[wires[i][1]][wires[i][0]] = 0;
			
			func(n, wires[i][0]);
			
			map[wires[i][0]][wires[i][1]] = 1;
			map[wires[i][1]][wires[i][0]] = 1;
		}
		
		System.out.println(min);
	}
	static void func(int n, int a) {
		boolean[] vis = new boolean[n+1];
		int cnt = 1;
		
		Queue<Integer> que = new LinkedList<>();
		que.add(a);
		
		while(!que.isEmpty()) {
			int num = que.poll();
			vis[num] = true;
			
			for(int i=1; i<=n; i++) {
				if(!vis[i] && map[num][i]==1) {
					que.add(i);
					cnt +=1;
				}
			}
		}
		
		min = Math.min(min, Math.abs(n-2*cnt));
	}
}
