package leve2;
import java.util.*;
public class A숫자카드나누기 {
	static int ans = 0;
	public static void main(String[] args) {
		int[] arrayA = {10, 20};
		int[] arrayB = {5, 17};
		
		int a = arrayA[0];
		for(int i=1; i<arrayA.length; i++) {
			a = func(a,arrayA[i]);
		}
//		System.out.println(a);
		
		int b = arrayB[0];
		for(int i=1; i<arrayB.length; i++) {
			b = func(b,arrayB[i]);
		}
//		System.out.println(b);
		
		if(check(b,arrayA)) {
			ans = Math.max(ans, b);
		}
		
		if(check(a,arrayB)) {
			ans = Math.max(ans, a);
		}
		System.out.println(ans);
	}
	private static int func(int a, int b) {
		if(b==0) {
			return a;
		}
		return func(b, a%b);
	}
	
	private static boolean check(int a, int[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%a ==0) return false;
		}
		
		return true;
	}
}
