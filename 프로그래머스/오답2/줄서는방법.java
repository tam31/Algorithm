package 오답2;
import java.util.*;
public class 줄서는방법 {

	public static void main(String[] args) {
		int n = 3;
		long k = 5;
		
		List<Integer> list = new ArrayList<>();
		long sum = 1;
		for(int i=1; i<=n; i++) {
			list.add(i);
			sum *=i;
		}
		k -=1;
		int[] ans = new int[n];
		
		for(int i=0; i<n; i++) {
			int cnt = n-i;
			sum /=cnt;
			int num = (int)(k/sum);
			
			ans[i] = list.get(num);
			list.remove(num);
			k = k%sum;
			
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
