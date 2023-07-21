package leve2;
import java.util.*;
public class A배열자르기 {

	public static void main(String[] args) {
		int n = 4;
		long left = 7;
		long right = 14;
		

		List<Integer> list = new ArrayList<>();
		for(Long i=left; i<=right; i++) {
			list.add((int)Math.max(i%n, i/n)+1);
		}
		
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
