package 프로그래머스;
import java.util.*;
public class 큰수만들기 {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		
		int n = number.length();
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<number.length(); i++) {
			
			int a = number.charAt(i)-'0';
			if(stack.isEmpty()) {
				stack.add(a);
			}else {
				while(!stack.isEmpty() &&stack.peek() < a && k>0) {
					stack.pop();
					k-=1;
				}
				stack.add(a);
			}
		}
		
		while(k>0) {
			stack.pop();
			k-=1;
		}
		
		String ans = "";
		for(int i=0; i<stack.size(); i++) {
			ans += stack.get(i);
		}
		
		System.out.println(ans);
	}

}
