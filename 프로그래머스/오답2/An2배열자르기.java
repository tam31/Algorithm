package 오답2;
import java.util.*;
public class An2배열자르기 {

	public static void main(String[] args) {
		int n = 4;
		int left = 7;
		int right = 14;
		
		int[] ans = new int[right-left+1];
		int k =0;
		for(int i=left; i<=right; i++) {
			int a = i/n +1;
			int b = i%n +1;
			ans[k] = Math.max(a, b);
			k++;
		
		}
		System.out.println(Arrays.toString(ans));
	}

}
