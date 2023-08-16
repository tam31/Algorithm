package 오답2;

import java.util.Arrays;

public class A양궁대회 {
	static int m;
	static int[] ans = {-1};
	static int max = 0;
	static int add = 0;
	static int[] lion = new int[11];
	public static void main(String[] args) {
		int n = 9;
		int[] info = {0,0,1,2,0,1,1,1,1,1,1};
		
		m = n;
		func(info, 0);
		System.out.println(Arrays.toString(ans));
	}
	private static void func(int[] info, int cnt) {
		if(cnt==m) {
			if(lion[0]==3) {
				System.out.println(Arrays.toString(lion));
			}
			int tmp = cal(info);
			if(tmp>=max) {
				max = tmp;
				ans = lion.clone();
			}
			
			return;
		}
		
		for(int i=0; i<11; i++) {
			if(lion[i] <= info[i]) {
				lion[i] +=1;
				func(info, cnt+1);
				lion[i] -=1;
			}else {
				break;
			}
			
		}
	}
	private static int cal(int[] info) {
		int li=0;
		int in=0;
		for(int i=0; i<11; i++) {
			if(lion[i]==0 && info[i] == 0) continue;
			if(lion[i]>info[i]) {
				li += 10-i;
			}else {
				in += 10-i;
			}
		}
		if(li-in<=0) return -1;
		return li-in;
	}
}
