package 오답1;
import java.util.*;
public class A여행경로 {
	static List<String> list = new ArrayList<>();
	static boolean[] vis;
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"},{"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
	
		vis = new boolean[tickets.length];
		dfs("ICN", "ICN", tickets, 0);
		Collections.sort(list);
		String[] ans = list.get(0).split(" ");
		System.out.println(Arrays.toString(ans));
	}
	private static void dfs(String start, String route, String[][] tickets, int cnt) {
		if(cnt==tickets.length) {
			list.add(route);
			return;
		}
		
		for(int i=0; i<tickets.length; i++) {
			if(start.equals(tickets[i][0]) && !vis[i]) {
				vis[i] = true;
				dfs(tickets[i][1], route+" "+tickets[i][1], tickets, cnt+1);
				vis[i] = false;
			}
		}
	}

}
