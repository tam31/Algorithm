package 오답2;
import java.util.*;
public class A이모티콘할인행사 {
	static int n;
	static int[] vis;
	static int[] list = {10,20,30,40};
	static int[] ans = new int[2];
	public static void main(String[] args) {
		int[][] users = {{40, 10000}, {25, 10000}};
		int[] emoticons = {7000,9000};
		
		n = emoticons.length;
		vis = new int[n];
		func(0,users,emoticons);
		System.out.println(Arrays.toString(ans));
	
	}
	private static void func(int cnt, int[][] users, int[] em) {
		if(cnt==n) {
			int num = 0;
			int sum = 0;
			for(int i=0; i<users.length; i++) {
				int[] tmp = users[i];
				int add = 0;
				for(int j=0; j<n; j++) {
					if(vis[j]>= tmp[0]) {
						add += (em[j]*(1.0*100-vis[j])/100);
//						System.out.println(em[j]+"-"+vis[j]+" "+(em[j]*(1.0*100-vis[j])/100));
					}
				}
				if(add>= tmp[1]) {
					num +=1;
				}else {
					sum += add;
				}
			}
			if(ans[0]<num) {
				ans[0] = num;
				ans[1] = sum;
			}else if(ans[0]==num) {
//				System.out.println(Arrays.toString(vis));
//				System.out.println(num+" "+sum);
				ans[0] = num;
				ans[1] = Math.max(ans[1], sum);
			}
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(vis[cnt]==0) {
				vis[cnt] = list[i];
				func(cnt+1,users,em);
				vis[cnt] = 0;
			}
		}
	}

}
