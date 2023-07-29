package 오답1;
import java.util.*;
public class A숫자카드나누기 {

	public static void main(String[] args) {
		int[] arrayA = {10,17};
		int[] arrayB = {5,20};
		
		int a = arrayA[0];
		int b = arrayB[0];
		for(int i=1; i<arrayA.length; i++) {
			a = func(a,arrayA[i]);
			b = func(b,arrayB[i]);
		}
		
		int ans = 0;
		if(check(a,arrayB)) {
			ans = Math.max(ans, a);
		}
		if(check(b,arrayA)) {
			ans = Math.max(ans, b);
		}
		
		System.out.println(ans);
	}
	
	private static int func(int a, int b) {
		if(b==0) {
			return a;
		}
		return func(b, a%b);
	}
	private static boolean check(int a, int[] list) {
		if(a==0) return false;
		for(int i=0; i<list.length; i++) {
			if(list[i]%a==0) {
				return false;
			}
		}
		return true;
	}
}
