package leve2;
import java.util.*;
public class A소수찾기 {
	static String[] num;
	static boolean[] vis;
	static Set<Integer> list = new HashSet<>();
	public static void main(String[] args) {
		String numbers = "011";
		
		num = numbers.split("");
		vis = new boolean[num.length];
		
		addString("");
		System.out.println(list.size());
	}
	private static void addString(String tmp) {
		if(tmp.length() != 0 &&check(tmp)) {
			list.add(Integer.parseInt(tmp));
		}
		if(tmp.length()==num.length) {
			return;
		}
		
		for(int i=0; i<num.length; i++) {
			if(!vis[i]) {
				vis[i]=true;
				addString(tmp+num[i]);
				vis[i]=false;
			}
		}
	}
	private static boolean check(String tmp) {
		int a = Integer.parseInt(tmp);
		if(a==0 || a==1) return false;
		for(int i=2; i*i<=a; i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

}
