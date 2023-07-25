package leve2;
import java.util.*;
public class Ak진수에서소수개수구하기 {
	public static void main(String[] args) {
		int n = 110011;
		int k = 10;
		
		
		String[] str = Integer.toString(n,k).split("0");
		int cnt = 0;
		
		for(String tmp:str) {
			if(tmp.equals("")) continue;
			if(func(Long.valueOf(tmp))) cnt+=1;
		}
		

		System.out.println(cnt);
		
	}
	private static boolean func(long num) {
		if(num <2) return false;
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
