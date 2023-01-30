package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A10773 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//스택으로 넣고 0을 받으면 빼준다.
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}else {
				stack.add(num);
			}
		}
		long sum = 0;
		for(int i=0; i<stack.size(); i++) {
			sum += stack.get(i);
		}
		System.out.println(sum);
	}

}
