package 오답2;
import java.util.*;
public class A숫자카드나누기 {

	public static void main(String[] args) {
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		
		int ans = 0;
		int a = arrayA[0];
		int b = arrayB[0];
		for(int i=1; i<arrayA.length; i++) {
			a = func(a,arrayA[i]);
			b = func(b, arrayB[i]);
		}
		
		if(check(arrayA,b)) {
			ans = Math.max(ans, b);
		}
		if(check(arrayB,a)) {
			ans = Math.max(ans, a);
		}
		
		System.out.println(ans);
		
	}
	private static int func(int a, int b) {
		if(b==0) {
			return a;
		}
		return func(b,a%b);
	}
	private static boolean check(int[] list, int a) {
		for(int i=0; i<list.length; i++) {
			if(list[i]%a==0) {
				return false;
			}
		}
		
		return true;
	}
}
