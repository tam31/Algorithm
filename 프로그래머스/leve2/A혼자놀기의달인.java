package leve2;
import java.util.*;
public class A혼자놀기의달인 {
	static boolean[] vis;
	public static void main(String[] args) {
		int[] cards = {8,6,3,7,2,5,1,4};
		
		List<Integer> list = new ArrayList<>();
		vis = new boolean[cards.length];
		
		for(int i=0; i<cards.length; i++) {
			if(!vis[i]) {
				int cnt = 1;
				vis[i] = true;
				int num = cards[i]-1;
				while(!vis[num]) {
					vis[num] = true;
					cnt +=1;
					num = cards[num]-1;
				}
				list.add(cnt);
			}
		}
		int ans = 0;
		Collections.sort(list);
		if(list.size()!=1) {
			ans = list.get(list.size()-1)*list.get(list.size()-2);
		}
		
		System.out.println(ans);
	}

}
