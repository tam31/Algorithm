package 오답2;
import java.util.*;
public class 혼자놀기의달인 {
	static boolean[] vis;
	static int n;
	public static void main(String[] args) {
		int[] cards = {8,6,3,7,2,5,1,4};
		
		List<Integer> list = new ArrayList<>();
		n = cards.length;
		vis = new boolean[n];
		for(int i=1; i<=n; i++) {
			if(!vis[i-1]) {
				int cnt = func(i,0, cards);
				list.add(cnt);
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		if(list.size()<2) {
			System.out.println(0);
		}
		
	}
	static private int func(int a, int cnt, int[] cards) {
		if(vis[a-1]) {
			return cnt;
		}
		vis[a-1]= true;
		return func(cards[a-1], cnt+1, cards);
	}
}
