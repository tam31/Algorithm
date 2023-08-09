package 오답2;
import java.util.*;
public class A큰수만들기 {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<number.length(); i++) {
			int tmp = number.charAt(i)-'0';
			
			while(!stack.isEmpty() && k!=0 && stack.peek() <tmp) {
				k-=1;
				stack.pop();
			}
			stack.add(tmp);
		}
		System.out.println(stack);
		while(k>0) {
			stack.pop();
			k-=1;
		}
		System.out.println(stack);
	
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		String ans = sb.reverse().toString();
		System.out.println(ans);
	}

}
