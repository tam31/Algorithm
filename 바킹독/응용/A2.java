package 응용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			for(int j = 0; j<str.length(); j++) {
				if(stack.isEmpty()) {
					stack.add(str.charAt(j));
				}else {
					if(stack.peek() == str.charAt(j)) {
						stack.pop();
					}else {
						stack.add(str.charAt(j));
					}
				}
			}
			if(stack.isEmpty()) {
				cnt +=1;
			}
		}
		System.out.println(cnt);
	}

}
