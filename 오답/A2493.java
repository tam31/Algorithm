package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A2493 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<int[]> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		stack.add(new int[] {100000001, 0});
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(stack.peek()[0] < num) {
				stack.pop();
			}
			sb.append(stack.peek()[1]+" ");
			stack.add(new int[] {num, i});
		}
		System.out.println(sb);
	}

}
