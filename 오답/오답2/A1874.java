package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		Stack<Integer> stack = new Stack<>(); 
		boolean ans = true;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			while(num>=cnt) {
				sb.append("+"+"\n");
				stack.add(cnt);
				cnt +=1;
			}
			if(stack.peek() == num) {
				stack.pop();
				sb.append("-"+"\n");
			}else {
				ans = false;
				break;
			}
			
		}
		
		if(ans) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
		
	}

}
