package 오답2;
import java.util.*;
public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		int n = numbers.length;
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(Integer.toString(numbers[i]));
		}
		
		Collections.sort(list, (o1,o2)->{
			return (o1+o2).compareTo(o2+o1);
		});
		
		String ans ="";
		for(int i=n-1; i>=0; i--) {
			ans += list.get(i);
		}
		
		System.out.println(ans);
	}

}
