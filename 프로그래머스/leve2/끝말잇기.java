package leve2;
import java.util.*;
public class 끝말잇기 {

	public static void main(String[] args) {
		int n = 5;
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
	
		int[] ans = new int[] {0,0};
		Set<String> list = new HashSet<>();
		list.add(words[0]);
		for(int i=1; i<words.length; i++) {
			
			char tmp = words[i-1].charAt(words[i-1].length()-1);
			char check= words[i].charAt(0);
			if(words[i].length()<2 || list.contains(words[i])
					|| tmp != check) {
//				System.out.println(i);
				ans[0] = i%n +1;
				ans[1] = i/n+1;
				break;
			}
			list.add(words[i]);
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
