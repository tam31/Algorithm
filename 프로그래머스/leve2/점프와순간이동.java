package leve2;
import java.util.*;
public class 점프와순간이동 {

	public static void main(String[] args) {
		int N = 5000;
		
		int cnt = 0;
		while(N != 0) {
			if(N%2 !=0) {
				N-=1;
				cnt +=1;
			}
			N /=2;
		}
		
		System.out.println(cnt);
	}

}
