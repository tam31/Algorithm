package leve2;
import java.util.*;
public class A이모티콘할인행사 {
	static int[] dis = {10,20,30,40};
	static int[] ans = new int[2];
	public static void main(String[] args) {
		int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
		int[] emoticons = {1300, 1500, 1600, 4900};
		
		func(users,emoticons,new int[emoticons.length],0);
		System.out.println(Arrays.toString(ans));
	}
	private static void func(int[][] users, int[] list, int[] discount, int dep) {
		if(dep == list.length) {
			int pep = 0;
			int mon = 0;
			
			for(int i=0; i<users.length; i++) {
				int sum = 0;
				for(int j=0; j<list.length; j++) {
					if(users[i][0]<=discount[j]) {
						sum += (int)(list[j]*(100-discount[j])*0.01);
					}
				}
				
				if(sum >= users[i][1]) {
					pep +=1;
				}else {
					mon += sum;
				}
			}
			
			if(pep > ans[0]) {
				ans[0] = pep;
				ans[1] = mon;
			}else if(pep == ans[0]) {
				ans[1] = Math.max(ans[1], mon);
			}
			return;
		}
		
		for(int i=0; i<4; i++) {
			discount[dep] = dis[i];
			func(users,list,discount,dep+1);
		}
	}
}
