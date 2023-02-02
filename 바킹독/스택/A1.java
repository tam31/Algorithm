package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack stack = new Stack<>();
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				stack.add(num);
			}else {
				stack.pop();
			}
		}
		
		int sum = 0;
		for(int i=0; i<stack.size(); i++) {
			sum += (int)stack.get(i);
		}
		System.out.println(sum);
	}

}
