package 오답1;
import java.util.*;
public class A모음사전 {
	static int ans = 0;
	static int cnt = 0;
	static String[] list = {"A","E","I","O","U"};
	public static void main(String[] args) {
		String word = "AAAE";
		
		func("",word);
		System.out.println(ans);
	}
	static void func(String str, String word) {
		cnt +=1;
		if(str.equals(word)) {
			ans = cnt-1;
		}
		if(str.length()==5) {
			return;
		}
		
		for(int i=0; i<5; i++) {
			func(str+list[i], word);
		}
		
	}
}
