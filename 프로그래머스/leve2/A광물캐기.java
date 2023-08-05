package leve2;
import java.util.*;
public class A광물캐기 {
	static int n = 0;;
	static int m;
	static int ans = Integer.MAX_VALUE;
	static int[] pick = {25,5,1};
	static int[] list;
	public static void main(String[] args) {
		int[] picks = {0,1,1};
		String[] minerals = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
		
		for(int i=0; i<3; i++) {
			n += picks[i];
		}
		m = minerals.length;
		list = new int[m];
		for(int i=0; i<m; i++) {
			int tmp = 1;
			if(minerals[i].equals("diamond")) tmp=25;
			if(minerals[i].equals("iron")) tmp=5;
			if(minerals[i].equals("stone")) tmp=1;
			list[i] = tmp;
		}
		func(picks,0,0,0);
		System.out.println(ans);
		
	}
	private static void func(int[] picks, int cnt, int sum, int num) {
		if(cnt == m || num ==n) {
			ans = Math.min(ans, sum);
//			System.out.println();
			return;
		}
		
		for(int i=0; i<3; i++) {
			if(picks[i] != 0) {
				picks[i] -=1;
				int add = 0;
				int tmp = pick[i];
				int k = Math.min(m, cnt+5);
				
				for(int j=cnt; j<k; j++) {
					int re = list[j]/tmp;
					if(re==0) re = 1;
					add += re;
//					System.out.println(re+" "+list[j]);
				}
				func(picks,k,sum+add,num+1);
				picks[i] +=1;
			}
			
		}
	}

}
