package leve2;
import java.util.*;
public class A모음사전2 {
	static String[] list = {"A","E","I","O","U"};
	static int cnt = 0;
	static int ans = 0;
	public static void main(String[] args) {
		String word = "AAAE";
		
		func("",word);
		System.out.println(ans);
	}
	private static void func(String tmp, String word) {
		if(tmp.equals(word)){
			ans = cnt;
			return;
		}
		
		if(tmp.length()==5) {
			return;
		}
		
		
		
		for(int i=0; i<5; i++) {
			cnt+=1;
			func(tmp+list[i],word);
		}
	}
}
