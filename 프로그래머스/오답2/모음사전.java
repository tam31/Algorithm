package 오답2;
import java.util.*;
public class 모음사전 {
	static int cnt = 0;
	static int ans = 0;
	static char[] data = {'A', 'E', 'I', 'O', 'U'};
	public static void main(String[] args) {
		String word = "I";
		
		
		int n = word.length();
		
		func("", word);
		
		System.out.println(ans);
	}
	private static void func(String str, String word) {
		if(str.length()==5) {
			return;
		}
		
		for(int i=0; i<5; i++) {
			String ss = str + data[i];
			cnt +=1;
			if(ss.equals(word)) {
				ans=cnt;
				return;
			}
			func(ss,word);
			
		}
	}
}
