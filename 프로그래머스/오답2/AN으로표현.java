package 오답2;
import java.util.*;
public class AN으로표현 {

	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		
		Set<Integer>[] set = new HashSet[9];
		for(int i=1; i<9; i++) {
			set[i] = new HashSet<>();
		}
		
		set[1].add(N);
		for(int i=1; i<9; i++) {
			for(int j=1; j<i; j++) {
				func(set[i], set[i-j], set[j]);
			}
			set[i].add(Integer.parseInt(String.valueOf(N).repeat(i)));
			if(set[i].contains(number)) {
				System.out.println(i); //return i;
				break;
			}
		}
		System.out.println(-1);//return -1;
	}

	private static void func(Set<Integer> set, Set<Integer> cal1, Set<Integer> cal2) {
		for(int num1 : cal1) {
			for(int num2 : cal2) {
				set.add(num1+num2);
				set.add(num1-num2);
				set.add(num1*num2);
				if(num2 !=0) set.add(num1/num2);
			}
		}
	}
	
}
