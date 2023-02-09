package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class A2493 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		Stack<int []> stack = new Stack<>();
		
		stack.add(new int[] {100000001,0});
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(stack.peek()[0] < num) {
				stack.pop();
			}
			arr[i] = stack.peek()[1];
			stack.add(new int[] {num,i+1});
		}
		for(int i=0; i<n; i++) {
			sb.append(arr[i]+" ");
		}
		System.out.println(sb);
	}

}
