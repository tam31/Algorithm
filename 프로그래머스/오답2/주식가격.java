package 오답2;
import java.util.*;
public class 주식가격 {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		
		int n = prices.length;
		int[] ans = new int[n];
		Stack<int[]> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			ans[i] = n-1-i;
			while(!stack.isEmpty() && stack.peek()[0]>prices[i]) {
				int[] data = stack.pop();
				ans[data[1]] = i-data[1];
			}
			stack.add(new int[] {prices[i], i});
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
