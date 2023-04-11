package 오답2;
import java.util.*;
public class 소수찾기 {
	static int n;
	static String[] arr;
	static boolean[] vis;
	static Set<Integer> set = new HashSet<>();
	static int ans = 0 ;
	public static void main(String[] args) {
		String numbers = "011";
		
		n = numbers.length();
		arr = numbers.split("");
		vis = new boolean[n];
		func("0");
		
		System.out.println(set);
		System.out.println(set.size());
	}
	
	private static void func(String a) {
		int b = Integer.parseInt(a);
		if(b>1) {
			boolean check = true;
			for(int i=2; i*i<=b; i++) {
				if(b%i==0) {
					check = false;
					break;
				}
			}
			if(check) {
				set.add(b);
			}
		}
		
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				func(a+arr[i]);
				vis[i] = false;
			}
		}
		
	}

}
