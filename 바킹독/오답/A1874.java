package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int k=1;
		boolean ans = true;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			while(k<=num) {
				sb.append("+"+"\n");
				stack.add(k);
				k+=1;
			}
			if(stack.peek() != num) {
				ans = false;
				break;
			}
			sb.append("-"+"\n");
			stack.pop();
		}
		if(ans) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}

}
