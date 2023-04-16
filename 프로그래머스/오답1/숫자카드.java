package 오답1;
import java.util.*;
public class 숫자카드 {

	public static void main(String[] args) {
		int[] arrayA = {14,35,119};
		int[] arrayB = {18,30,102};
		
		int gcda = arrayA[0];
		int gcdb = arrayB[0];
		
		for(int i=1; i<arrayA.length; i++) {
			gcda = mod(gcda, arrayA[i]);
			gcdb = mod(gcdb, arrayB[i]);
		}
		
		int ans = 0;
		
		boolean a = true;
		for(int i=0; i<arrayA.length; i++) {
			if(arrayA[i] % gcdb == 0) {
				a = false;
				break;
			}
		}
		
		if(a) {
			ans = Math.max(ans, gcdb);
		}
		
		boolean b = true;
		for(int i=0; i<arrayB.length; i++) {
			if(arrayB[i] % gcda == 0) {
				b = false;
				break;
			}
		}
		
		if(b) {
			ans = Math.max(ans, gcda);
		}
		
		System.out.println(ans);
		
		
	}
	
	private static int mod(int a, int b) {
		if(b==0) {
			return a;
		}
		return mod(b, a%b);
	}
}
