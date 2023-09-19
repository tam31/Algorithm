package leve3;
import java.util.*;
public class A여행경로 {
	static List<String> list = new ArrayList<>();
	static boolean[] vis;
	static int n;
	public static void main(String[] args) {
		String[][] tickets ={{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
	
		n = tickets.length;
		vis = new boolean[n];
		dfs("ICN","ICN",tickets,0);
		Collections.sort(list);
		String[] ans = list.get(0).split(" ");
		System.out.println(Arrays.toString(ans));
	}
	private static void dfs(String start, String rotue, String[][] tickets, int cnt) {
		if(cnt ==n) {
			list.add(rotue);
		}
		
		for(int i=0; i<n; i++) {
			if(!vis[i] && tickets[i][0].equals(start)) {
				vis[i] = true;
				dfs(tickets[i][1], rotue+" "+tickets[i][1], tickets,cnt+1);
				vis[i] = false;
			}
		}
	}
}
