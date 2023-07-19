package leve2;
import java.util.*;
public class A괄호회전하기 {
	static Stack<Character> stack;
	public static void main(String[] args) {
		String s ="}}}";
		
		int ans = 0;
		
		if(func(s)) ans++;
		for(int i=1; i<s.length(); i++) {
			s = s.substring(1)+s.charAt(0);
			if(func(s)) ans++;
		}
		
		System.out.println(ans);
	}
	private static boolean func(String s) {
		stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char tmp = s.charAt(i);
			if(stack.isEmpty()) {
				stack.add(tmp);
			}else {
				if(stack.peek() == '(' && tmp ==')') {
					stack.pop();
				}else if(stack.peek() =='{' && tmp == '}') {
					stack.pop();
				}else if(stack.peek()=='[' && tmp ==']') {
					stack.pop();
				}else {
					stack.add(tmp);
				}
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		
		
		return false;
	}
}
