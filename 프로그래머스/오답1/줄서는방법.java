package 오답1;
import java.util.*;
public class 줄서는방법 {

	public static void main(String[] args) {
		int n = 3;
		int k= 5;
		
		int ans[] = new int[n];
		List<Integer> list = new ArrayList<>();
		int f = 1;
		for(int i=1; i<=n; i++) {
			f*=i;
			list.add(i);
		}
		
		k -=1;
		int idx = 0;
		while(n>0) {
			f = f/n;
			int num = k/f;
			ans[idx] = list.get(num);
			list.remove(num);
			
			k = k%f;
			idx +=1;
			n -= 1;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
