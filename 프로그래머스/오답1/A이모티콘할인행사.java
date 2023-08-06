package 오답1;
import java.util.*;
public class A이모티콘할인행사 {
	static int[] list= {10,20,30,40};
	static int[] vis;
	static int[] ans = new int[2];
	static int n;
	static int m;
	public static void main(String[] args) {
		int[][] users = {{40, 10000}, {25, 10000}}; 
//			{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
		int[] emoticons = {7000, 9000};
//1300, 1500, 1600, 4900};
		
		n = users.length;
		m = emoticons.length;
		vis = new int[m];
		int user = 0;
		func(users, emoticons, 0);
		System.out.println(Arrays.toString(ans));
	}
	private static void func(int[][] users, int[] emoticons, int cnt) {
//		System.out.println(Arrays.toString(vis)+" ");
		if(m == cnt) {
//			System.out.println(Arrays.toString(vis));
			int user = 0;
			int add = 0;
			for(int i=0; i<n; i++) {
				int sum = 0;
				for(int j=0; j<m; j++) {
					if(users[i][0] <= vis[j]) {
						sum += (int)(emoticons[j]*(100-vis[j])*0.01);
					}
				}
				
				if(users[i][1]<= sum) {
					user +=1;
				}else {
//					System.out.println(users[i][1]+" "+sum);
					add += sum;
				}
			
			}
			
			if(ans[0]<= user) {
//				System.out.println(user+" "+add);
				if(ans[0]==user) {
					ans[1] = Math.max(ans[1], add);
				}else {
					ans[1] = add;
				}
				ans[0] = user;
			}
			
			return;
		}
		
		for(int i=0; i<m; i++) {
			if(vis[i] == 0) {
				for(int j=0; j<4; j++) {
					vis[i] = list[j];
					func(users, emoticons, cnt+1);
					vis[i] = 0;
				}
				return;
			}
		}
	}
}
