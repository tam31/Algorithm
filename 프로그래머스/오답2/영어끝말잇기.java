package 오답2;
import java.util.*;
public class 영어끝말잇기 {

	public static void main(String[] args) {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		int m = words.length;
		int[] ans = new int[2];
		ArrayList<String> list = new ArrayList<>();
		list.add(words[0]);
		char end = words[0].charAt(words[0].length()-1);
		for(int i=1; i<m; i++) {
			char start = words[i].charAt(0);
			
			if(start != end || list.contains(words[i])) {
				ans[0] = i%n +1;
				ans[1] = (int)Math.ceil((double)(i+1)/n);
				break;
			}
			list.add(words[i]);
			end =  words[i].charAt(words[i].length()-1);
		}
		System.out.println(Arrays.toString(ans));
	}

}
