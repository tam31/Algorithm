package 오답2;
import java.util.*;
public class 뒤에큰수 {

	public static void main(String[] args) {
		int[] numbers = {2,3,3,5};
		
		Stack<int[]> stack = new Stack<>();
		int[] ans = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			int num = numbers[i];
			if(stack.isEmpty()) {
				stack.add(new int[] {num, i});
			}else {
				while(!stack.isEmpty()&& stack.peek()[0] < num) {
					int[] data = stack.pop();
					ans[data[1]] = num;
				}
				stack.add(new int[] {num,i});
			}
		}
		while(!stack.isEmpty()) {
			int[] data = stack.pop();
			ans[data[1]] = -1;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
