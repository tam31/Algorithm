package 오답1;
import java.util.*;
public class 최소공배수 {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		
		int num = arr[0];
		for(int i=1; i<arr.length; i++) {
			int a = gcd(num, arr[i]);
			num = (num*arr[i])/a;
		}
		
		System.out.println(num);
	}
	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
