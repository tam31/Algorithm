package 프로그래머스;
import java.util.*;
public class 소수찾기 {
	static boolean[] vis;
	static String[] str;
	static int n;
	static int ans = 0;
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		String numbers = "17";
		
		n = numbers.length();
		vis = new boolean[n];
		str = numbers.split("");
		
		func("0");
		System.out.println(ans);
	}
	private static void func(String a) {
		int b = Integer.parseInt(a);
		if(b>1) {
			boolean check = true;
			for(int i=2; i*i<=b; i++) {
				if(b%i==0) {
					check= false;
					break;
				}
			}
			if(check && !list.contains(b)) {
				ans++;
				list.add(b);
			}
		}
		
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				func(a+str[i]);
				vis[i] = false;
			}
		}
	}

}
