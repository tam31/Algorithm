package 오답2;
import java.util.*;
public class A연속부분수열합의개수 {

	public static void main(String[] args) {
		int[] elements = {7,9,1,1,4};
		
		int n = elements.length;
		Set<Integer> set = new HashSet<>();
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int k=0; k<i; k++) {
					sum+=elements[(j+k)%n];
				}
				set.add(sum);
			}
		}
		System.out.println(set.size());
	}

}
