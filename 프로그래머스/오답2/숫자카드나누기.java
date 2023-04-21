package 오답2;
import java.util.*;
public class 숫자카드나누기 {

	public static void main(String[] args) {
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		
		int ans = 0;
		int num1 = arrayA[0];
		int num2 = arrayB[0];
		for(int i=1; i<arrayA.length; i++) {
			num1 = gcd(num1,arrayA[i]);
			num2 = gcd(num2, arrayB[i]);
		}
		
		if(check(arrayA,num2)) {
			ans = Math.max(ans, num2);
		}
		if(check(arrayB, num1)) {
			ans = Math.max(ans, num1);
		}
		
		System.out.println(ans);
		
	}
	
	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	private static boolean check(int[] arr, int a) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] % a == 0) {
				return false;
			}
		}
		return true;
	}
}
