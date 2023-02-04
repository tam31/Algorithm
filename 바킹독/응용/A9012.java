package 응용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A9012 {
	static Stack<Character> stack;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			stack = new Stack<>();
			if(check(str)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	public static boolean check(String str) {
		for(int j=0; j<str.length(); j++) {
			//스택이 비어있으면 넣기
			if(stack.isEmpty()) {
				stack.add(str.charAt(j));
			}else {
				if(str.charAt(j) == '(') {
					stack.add(str.charAt(j));
				}else {
					if(stack.peek() == '(') {
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
	}

}
