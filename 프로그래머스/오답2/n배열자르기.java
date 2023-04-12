package 오답2;
import java.util.*;
public class n배열자르기 {

	public static void main(String[] args) {
		int n = 3;
		int left = 2;
		int right = 5;
		
		int[] ans = new int[right-left+1];
		int count = 0;
		
		for(int i=left; i<=right; i++) {
			int a = i/n+1;
			int b = i%n+1;
			
			if(a>b) {
				ans[count] = a;
			}else {
				ans[count] = b;
			}
			count +=1;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
