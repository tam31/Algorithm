package level1;
import java.util.*;
public class 소수 {
	public static void main(String[] args) {
		int n = 10;
		
		int cnt = 0;
		for(int i=2; i<=n; i++) {
			if(func(i)) cnt +=1;
		}
		System.out.println(cnt);
	}
	static boolean func(int n) {
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n %i==0) {
				return false;
			}
		}
		return true;
	}
}
