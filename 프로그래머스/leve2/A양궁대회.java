package leve2;
import java.util.*;
public class A양궁대회 {
	static int[] res = new int[11];
	static int[] lion = {-1};
	static int max = 0;
	public static void main(String[] args) {
		int n = 5;
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		
		func(0,n,info);
		System.out.println(Arrays.toString(lion));
	}
	private static void func(int depth, int n, int[] info) {
		
		if(depth==n) {
			int diff = score(info);
			if(max<=diff) {
				max = diff;
				lion = res.clone();
			}
			return;
		}
		
		for(int i=0; i<11 && res[i]<=info[i]; i++) {
			res[i] +=1;
			func(depth+1,n,info);
			res[i] -=1;
		}
	
	}
	
	public static int score(int[] info) {
		int apeach =0, lion =0;
		for(int i=0; i<11; i++) {
			if(info[i]==0 && res[i] ==0) continue;
			if(info[i]>=res[i]) apeach +=(10-i);
			else lion +=(10-i);
		}
		int diff = lion-apeach;
		if(diff<=0) return -1;
		return diff;
	}
}
