package 오답1;
import java.util.*;
public class k진수에서소수개수구하기 {

	public static void main(String[] args) {
		int n = 110011;
		int k = 10;
		
		int ans = 0;
		String[] str = Integer.toString(n,k).split("0");
		for(String tmp:str) {
			if(tmp.equals("")) continue;
			if(func(tmp)) ans +=1;
		}
		System.out.println(ans);
		
	}
	private static boolean func(String tmp) {
		long a = Long.parseLong(tmp);
		if(a <2) return false;
		for(long i=2; i<=Math.sqrt(a); i++) {
			if(a%i==0) return false;
		}
		return true;
	}
}
