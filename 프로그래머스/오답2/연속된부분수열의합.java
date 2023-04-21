package 오답2;
import java.util.*;
public class 연속된부분수열의합 {

	public static void main(String[] args) {
		int[] sequence = {2,2,2,2,2};
		int k = 6;
		
		int n = sequence.length;
		int left = 0;
		int right = 0;
		int sum = sequence[0];
		int sleft = 0;
		int sright = 0;
		int len = n;
		
		while(left<n && right <n) {
			if(sum==k && left-right < len) {
				sleft = left;
				sright = right;
				len = left-right;
			}
			if(sum<=k && left<n) {
				left +=1;
				if(left<n) {
					sum += sequence[left];
				}
			}else {
				sum -= sequence[right];
				right +=1;
			}
		}
		
		int[] ans = new int[2];
		ans[0]=sright;
		ans[1] = sleft;
	}

}
