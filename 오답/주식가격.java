package 오답1;

import java.util.*;
public class 주식가격 {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		
		int n = prices.length;
		int[] ans = new int[n];
		Stack<int[]> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			ans[i] = n-1-i;
			int[] a = {prices[i],i};
			while(!stack.isEmpty() && stack.peek()[0]>prices[i]) {
				ans[stack.peek()[1]] = i-stack.peek()[1];
				stack.pop();
			}
			stack.add(a);
			
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
