package 응용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1 {
	static String str;
	static Stack<Character> stack;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			boolean ans = check();
			if(ans) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			
		}
	}
	public static boolean check() {
		stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.add(str.charAt(i));
			}else if(str.charAt(i) == '[') {
				stack.add(str.charAt(i));
			}else if(str.charAt(i) == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}else {
					return false;
				}
			}else if(str.charAt(i) == ']') {
				if(!stack.isEmpty()&& stack.peek() == '[') {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
