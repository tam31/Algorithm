package leve2;
import java.util.*;
public class A피로도 {
	static boolean[] vis;
	static int ans = 0;
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		
		vis = new boolean[dungeons.length];
		func(dungeons, k,0);
		System.out.println(ans);
	}
	static void func(int[][] list, int k, int cnt) {
		
		ans = Math.max(ans, cnt);
		
		for(int i=0; i<list.length; i++) {
			if(k>=list[i][0] && !vis[i]) {
				vis[i]=true;
				func(list,k-list[i][1],cnt+1);
				vis[i] = false;
			}
		}
	}
}
