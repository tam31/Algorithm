package leve3;
import java.util.*;
public class A최고의집합 {

	public static void main(String[] args) {
		int n = 2;
		int s= 9;
		
		if(n>s) {
			System.out.println(new int[] {-1});
		}else {
			int[] ans = new int[n];
			for(int i=0; i<n; i++) {
				ans[i] = (s/n);
			}
			
			
			int tmp = s%n;
			for(int i=0; i<tmp; i++) {
				ans[i]+=1;
			}
			Arrays.sort(ans);
			System.out.println(Arrays.toString(ans));
		}
		
		
	}

}
