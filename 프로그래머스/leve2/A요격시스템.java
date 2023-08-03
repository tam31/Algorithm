package leve2;
import java.util.*;
public class A요격시스템 {

	public static void main(String[] args) {
		int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
	
		Arrays.sort(targets, (o1,o2)->{
			if(o1[1]==o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1];
		});
		
		
		Stack<int[]> stack = new Stack<>();
		for(int i=0; i<targets.length; i++) {
			if(stack.isEmpty()) {
				stack.add(new int[] {targets[i][0], targets[i][1]});
			}else {
				int end = stack.peek()[1];
				int start = targets[i][0];
				if(start>=end) {
					stack.add(targets[i]);
				}
			}
		}
		
		System.out.println(stack.size());
	}

}
