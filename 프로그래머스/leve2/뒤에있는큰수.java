package leve2;
import java.util.*;
public class 뒤에있는큰수 {

	public static void main(String[] args) {
		int[] numbers = {9, 1, 5, 3, 6, 2};
		
		int n = numbers.length;
		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		Stack<int[]> stack = new Stack<>();
		stack.add(new int[] {0, numbers[0]});
		
		for(int i=1; i<n; i++) {
			int a = numbers[i];
			while(!stack.isEmpty() && stack.peek()[1] <a) {
				int[] data = stack.pop();
				ans[data[0]] = a;
			}
			stack.add(new int[] {i,a});
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
