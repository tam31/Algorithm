package leve2;
import java.util.*;
public class 혼자놀기 {
	static boolean vis[];
	public static void main(String[] args) {
		int[] cards = {8,6,3,7,2,5,1,4};
		
		List<Integer> list = new LinkedList<>();
		int ans = 0;
		vis = new boolean[cards.length+1];
		for(int i=0; i<cards.length; i++) {
			if(!vis[i+1]) {
				int cnt = func(i+1,0,cards);
				list.add(cnt);
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		if(list.size()==1) System.out.println(0);
		System.out.println(list.get(0)*list.get(1));
	}
	private static int func(int a, int cnt, int[] cards) {
		if(vis[a]) {
			return cnt;
		}
		vis[a] = true;
		return func(cards[a-1], cnt+1, cards);
	}

}
