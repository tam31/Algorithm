package leve2;
import java.util.*;
public class A뒤에있는큰수찾기 {

	public static void main(String[] args) {
		int[] numbers = {9, 1, 5, 3, 6, 2};
		
		int[] ans = new int[numbers.length];
		Stack<int[]> stack = new Stack<>();
		for(int i=0; i<numbers.length; i++) {
			int num = numbers[i];
			while(!stack.empty() && stack.peek()[1] < num) {
				int[] tmp = stack.pop();
				ans[tmp[0]] = num;
			}
			stack.add(new int[] {i, num});
		}
		while(!stack.isEmpty()) {
			int[] tmp = stack.pop();
			ans[tmp[0]] = -1;
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
