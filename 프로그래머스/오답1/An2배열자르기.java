package 오답1;
import java.util.*;
public class An2배열자르기 {

	public static void main(String[] args) {
		int n = 3;
		int left = 2;
		int right = 5;
		
		int[] ans = new int[right-left+1];
		int k = 0;
		for(int i=left; i<=right; i++) {
			int a = Math.max(i/n, i%n)+1;
			ans[k] = a;
			k++;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
