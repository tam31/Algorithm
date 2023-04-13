package 오답2;
import java.util.*;
public class 점찍기 {

	public static void main(String[] args) {
		int k = 2;
		int d = 4;
		
		int cnt = 0;
		for(int i=0; i<=d; i+=k) {
			cnt+= Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2))/k+1;
		}
		
		System.out.println(cnt);
	}

}
