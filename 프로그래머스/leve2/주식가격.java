package leve2;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		
		int len = prices.length;
		int[] ans = new int[len];
		
		Stack<int[]> stack = new Stack<>();
		for(int i=0; i<len; i++) {
			ans[i] = len-1-i;
			int[] num = {i, prices[i]};
			while(!stack.isEmpty() && 
					stack.peek()[1]>prices[i]) {
				int[] data = stack.pop();
				ans[data[0]] = i-data[0];
			}
			stack.add(num);
		}
		System.out.println(Arrays.toString(ans));
	}

}
