package leve2;
import java.util.*;
public class A연속부분수열합의개수 {
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) {
		int[] elements = {7,9,1,1,4};
		
		for(int i=1; i<=elements.length; i++) {
			int sum = 0;
			for(int j=0; j<elements.length; j++) {
				int cnt = 0;
				for(int k=j; k<j+i; k++) {
					cnt += elements[k%elements.length];
				}
				set.add(cnt);
			}
		}
		System.out.println(set.size());
	}

}
