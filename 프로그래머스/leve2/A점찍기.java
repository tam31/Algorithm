package leve2;
import java.util.*;
public class A점찍기 {

	public static void main(String[] args) {
		int k = 1;
		int d = 5;
		
		long ans = 0;
		for(int i=0; i<=d; i+=k) {
			ans +=1;
			ans += (int)Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2))/k;
		}
		
		System.out.println(ans);
	}

}
