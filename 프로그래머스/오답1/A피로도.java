package 오답1;
import java.util.*;
public class A피로도 {
	static boolean[] vis;
	static int ans;
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		
		vis = new boolean[dungeons.length];
		func(k, dungeons, 0);
		
		System.out.println(ans);
	}
	
	private static void func(int k, int[][] list, int cnt) {
		ans = Math.max(ans, cnt);
		if(cnt == list.length) {
			return;
		}
		
		for(int i=0; i<list.length; i++) {
			if(k>=list[i][0] && !vis[i]) {
				vis[i] = true;
				func(k-list[i][1], list, cnt+1);
				vis[i] = false;
			}
		}
	}

}
