package 오답1;
import java.util.*;
public class A가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		List<String> list = new ArrayList<>();
		for(int tmp : numbers) {
			list.add(String.valueOf(tmp));
		}
		
		Collections.sort(list, (o1,o2)->{
			return (o2+o1).compareTo(o1+o2);
		});
		
		String ans ="";
		for(String tmp: list) {
			ans += tmp;
		}
		
		if(ans.charAt(0)=='0'){
            ans = "0";
        }
		System.out.println(ans);
	}

}
