package leve2;
import java.util.*;
public class 대진표 {

	public static void main(String[] args) {
		int N = 8;
		int A = 4;
		int B = 7;
		
		int cnt = 0;
		while(A!=B) {
			A = (A+1)/2;
			B = (B+1)/2;
			cnt +=1;
		}
		
		System.out.println(cnt);
	}

}
