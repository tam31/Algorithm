package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		long cnt = 0;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			while(!stack.isEmpty()) {
				if(stack.peek() > num) {
					cnt += stack.size();
					break;
				}else {
					stack.pop();
				}
			}
			stack.add(num);
		}
		System.out.println(cnt);
	}

}
