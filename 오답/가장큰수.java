package 오답1;
import java.util.*;
public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3,30,34,5,9};
		
		int n = numbers.length;
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = Integer.toString(numbers[i]);
		}
		
		Arrays.sort(str, (o1,o2)->{
			return (o1+o2).compareTo(o2+o1);
		});
		
		String ans = "";
		for(int i=n-1; i>=0; i--) {
			ans += str[i];
		}
		System.out.println(ans);
	}

}
