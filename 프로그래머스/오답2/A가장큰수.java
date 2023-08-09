package 오답2;
import java.util.*;
public class A가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		List<String> list = new LinkedList<>();
		for(int i=0; i<numbers.length; i++) {
			list.add(String.valueOf(numbers[i]));
		}
		
		Collections.sort(list,(o1,o2)->{
			return (o2+o1).compareTo(o1+o2);
		});
		
		String ans = "";
		for(String str:list) {
			ans += str;
		}
		
		if(ans.charAt(0)=='0') {
			ans = "0";
		}
		System.out.println(ans);
	}

}
