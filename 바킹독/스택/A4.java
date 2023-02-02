package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<int[]> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				if(stack.peek()[1] > num) {
					sb.append(stack.peek()[0]+" ");
					break;
				}
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				sb.append("0 ");
			}
			stack.add(new int[] {i,num});
			
		}
		
		System.out.println(sb);
	}

}
