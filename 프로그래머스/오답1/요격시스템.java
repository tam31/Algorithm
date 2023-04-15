package 오답1;
import java.util.*;
public class 요격시스템 {

	public static void main(String[] args) {
		int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
		
		Arrays.sort(targets, (o1,o2)->{
			return o1[1]-o2[1];
		});
		Stack<Integer> stack = new Stack<>();
		
		stack.add(targets[0][1]);
		for(int i=1; i<targets.length; i++) {
			if(stack.peek() <= targets[i][0]) {
				stack.add(targets[i][1]);
			}
		}
		
		System.out.println(stack.size());
	}

}
