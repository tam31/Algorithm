package 오답1;
import java.util.*;
public class A큰수만들기 {

	public static void main(String[] args) {
		String number = "4321";
		int k = 1;
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<number.length(); i++) {
			int num = number.charAt(i)-'0';
			
			while(!stack.isEmpty() && k !=0 && stack.peek()<num) {
				stack.pop();
				k-=1;
			}
			stack.add(num);
			
		}
		
		while(k!=0) {
			stack.pop();
			k-=1;
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		String ans = sb.reverse().toString();
		System.out.println(ans);
		
	}

}
