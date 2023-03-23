package leve2;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "cdcd";
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(!stack.isEmpty()&&stack.peek() == s.charAt(i)) {
				stack.pop();
			}else {
				stack.add(s.charAt(i));
			}
		}
		System.out.println(stack);
	}

}
