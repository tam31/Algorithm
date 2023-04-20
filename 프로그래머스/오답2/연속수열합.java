package 오답2;
import java.util.*;
public class 연속수열합 {

	public static void main(String[] args) {
		int[] elements = {7,9,1,1,4};
		
		int n = elements.length;
		Set<Integer> set = new HashSet<>();
		
		for(int i=1; i<=n ; i++) {
			
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int k=0; k<i; k++) {
					int num = (k+j)%n;
					sum += elements[num];
				}
				set.add(sum);
			}
		}
		
		System.out.println(set.size());
	}

}
