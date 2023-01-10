package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		boolean ans = false;
		for(int i = 0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			while(cnt <num) {
				sb.append("+"+"\n");
				cnt+=1;
				stack.push(cnt);
			}
			if((int)stack.peek() != num) {
				ans = true;
				break;
			}
			stack.pop();
			sb.append("-"+"\n");
			
		}
		if(ans) {
			System.out.println("NO");
		}
		else {
			System.out.println(sb);
		}
	}

}
