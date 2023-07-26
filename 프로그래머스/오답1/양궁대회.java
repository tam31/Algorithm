package 오답1;
import java.util.*;
public class 양궁대회 {
	static int max = 0;
	static int[] re = {-1};
	static int[] lion = new int[11];
	public static void main(String[] args) {
		int n = 9;
		int[] info = {0,0,1,2,0,1,1,1,1,1,1};
		
		func(n,info,0);
		System.out.println(Arrays.toString(re));
	}
	
	private static void func(int n, int[] info, int cnt) {
		if(n==cnt) {
			int num = check(info);
			if(max<=num) {
				max = num;
				re = lion.clone();
			}
			return;
		}
		
		for(int i=0; i<11 && lion[i]<=info[i]; i++) {
			lion[i]+=1;
			func(n,info,cnt+1);
			lion[i] -=1;
		}
	}
	private static int check(int[] info) {
		int a = 0;
		int b = 0;
		for(int i=0; i<11; i++) {
			if(info[i]==0 && lion[i] == 0) continue;
			if(info[i]>=lion[i]) {
				a+=(10-i);
			}else {
				b+=(10-i);
			}
		}
		return b-a;
	}
}
