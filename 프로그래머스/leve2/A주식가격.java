package leve2;
import java.util.*;
public class A주식가격 {

	public static void main(String[] args) {
		int[] prices = {5,4,3,2,1};
		
		Stack<int[]> stack = new Stack<>();
		int len = prices.length;
		int[] ans = new int[len];
		
		for(int i=0; i<len; i++) {
			ans[i] = len-1-i;
			
			while(!stack.isEmpty()&& stack.peek()[0]>prices[i]) {
				int[] tmp = stack.pop();
				ans[tmp[1]]= i-tmp[1];
			}
			stack.add(new int[] {prices[i],i});
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
