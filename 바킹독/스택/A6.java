package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class A6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[n];
		Stack<int[]> stack = new Stack<>();
		stack.add(new int[] {1000001,0});
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(stack.peek()[0] < num) {
				int[] a = stack.pop();
				arr[a[1]] = num; 
			}
			stack.add(new int[] {num,i});
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				arr[i] = -1;
			}
			sb.append(arr[i]+" ");
		}
		System.out.println(sb);
	}

}
