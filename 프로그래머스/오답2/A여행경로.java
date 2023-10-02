package 오답2;
import java.util.*;
import java.util.ArrayList;

public class A여행경로 {
	static List<String> list = new ArrayList<>();
	static boolean[] vis;
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
	
		int n = tickets.length;
		vis = new boolean[n];
		dfs(tickets,"ICN", "ICN",n,0);
		Collections.sort(list);
		String[] ans = list.get(0).split(" ");
		System.out.println(Arrays.toString(ans));
	}
	private static void dfs(String[][] tickets,String now, String tour, int n, int cnt) {
		if(n==cnt) {
			list.add(tour);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(tickets[i][0].equals(now) && !vis[i]) {
				vis[i] = true;
				dfs(tickets, tickets[i][1], tour+" "+tickets[i][1],n,cnt+1);
				vis[i] = false;
			}
		}
	}
}
