package 오답1;
import java.util.*;
public class AN으로표현 {

	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		
		Set<Integer>[] set = new Set[9];
		for(int i=1; i<9; i++) {
			set[i] = new HashSet<>();
		}
		
		set[1].add(N);
		int ans = -1;
		for(int i=1; i<9; i++) {
			for(int j=1; j<i; j++) {
				func(set[i],set[i-j],set[j]);
			}
			int num=Integer.parseInt(String.valueOf(N).repeat(i));
			set[i].add(num);
			if(set[i].contains(number)) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		
	}
	
	private static void func(Set<Integer> set, Set<Integer> cal1, Set<Integer> cal2) {
		for(int x: cal1) {
			for(int y: cal2) {
				set.add(x+y);
				set.add(x-y);
				set.add(x*y);
				if(y!=0) set.add(x/y);
			}
		}
	}
}
