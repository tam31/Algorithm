package leve3;
import java.util.*;
public class A단어변환 {
	static boolean[] vis;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log"};
		
		vis = new boolean[words.length];
		func(begin,target,words, 0);
		ans = ans==Integer.MAX_VALUE ? 0 : ans;
		System.out.println(ans);
	}
	private static void func(String begin, String target, String[] words, int cnt) {
		if(cnt > words.length) {
			return;
		}
		if(begin.equals(target)) {
			ans = Math.min(cnt, ans);
			return;
		}
		
		for(int i=0; i<words.length; i++) {
			if(!vis[i]) {
				if(check(begin,words[i])) {
					vis[i] = true;
					func(words[i],target, words, cnt+1);
					vis[i] = false;
				}
			}
		}
	}

	private static boolean check(String begin, String tmp) {
		String str1 = begin;
		String str2 = tmp;
		if(begin.length()<tmp.length()) {
			str1 = tmp;
			str2 = begin;
		}
		int cnt = str1.length()-str2.length();
		for(int i=0; i<str2.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				cnt +=1;
			}
		}
		return cnt==1 ? true : false;
	}
}
