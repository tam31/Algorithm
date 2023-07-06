package leve2;
import java.util.*;
public class A가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		String[] num = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			num[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(num, (o1,o2)->{
			
			return (o2+o1).compareTo(o1+o2);
		});
		
		StringBuilder sb = new StringBuilder();
		for(String k:num) {
			sb.append(k);
		}
		String ans = sb.toString();
		if(ans.charAt(0)=='0') {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
		
	}

}
