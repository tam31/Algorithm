package 오답1;
import java.util.*;
public class 연속부분수열합 {

	public static void main(String[] args) {
		int[] elements = {7,9,1,1,4};
		
		int n = elements.length;
		int cnt = 0;
		Set<Integer> set = new HashSet<>();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int z=0; z<i; z++) {
					int num = (j+z)%n;
					sum += elements[num];
				}
				set.add(sum);
			}
		}
		
		System.out.println(set.size());
	}

}
