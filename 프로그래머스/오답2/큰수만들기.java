package 오답2;
import java.util.*;
public class 큰수만들기 {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		
		int n = number.length();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			char num = number.charAt(i);
			if(stack.isEmpty()) {
				stack.add(num);
			}else {
				while(k>0&&!stack.isEmpty()&&stack.peek()<num) {
					
					stack.pop();
					k-=1;
				}
				stack.add(num);
			}
		}
		
		while(k>0) {
			stack.pop();
			k-=1;
		}
		
		String ans ="";
		for(int i=0; i<stack.size(); i++) {
			ans += stack.get(i);
		}
		
		System.out.println(ans);
	}

}
