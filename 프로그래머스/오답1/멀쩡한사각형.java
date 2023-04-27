package 오답1;
import java.util.*;
public class 멀쩡한사각형 {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		
		int num = gcd(w,h);
		long sum = w*h - ((w/num)+(h/num)-1)*num;
		
		System.out.println(sum);
	}
	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
