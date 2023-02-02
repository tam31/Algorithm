package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Stack stack = new Stack<>();
		int k = 1;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			while(k<=n+1) {
				if(stack.isEmpty()) {
					stack.add(k);
					sb.append("+"+"\n");
					k+=1;
				}
				if((int)stack.peek() == num) {
					stack.pop();
					sb.append("-"+"\n");
					break;
				}else {
					stack.add(k);
					sb.append("+"+"\n");
					k+=1;
				}
				
			}
		}
		if(stack.isEmpty()) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}

}
