package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class A13913 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n= Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[100001];
		int[] vis = new int[100001];
		
		Arrays.fill(arr, -1);
		
		Queue<Integer> que = new LinkedList<>();
		que.add(n);
		arr[n] = 0;
		vis[n] = n;
		
		while(!que.isEmpty()) {
			int data = que.poll();

			if(data == m) {
				System.out.println(arr[m]);
				break;
			}
			
			if(data-1>=0 && arr[data-1] == -1) {
				arr[data-1] = arr[data]+1;
				vis[data-1] = data;
				que.add(data-1);
			}
			
			if(data+1<100001 && arr[data+1] == -1) {
				arr[data+1] = arr[data]+1;
				vis[data+1] = data;
				que.add(data+1);
			}
			
			if(data*2<100001 && arr[data*2] == -1) {
				arr[data*2] = arr[data]+1;
				vis[data*2] = data;
				que.add(data*2);
			}
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.add(m);
		
		while(stack.peek() != n) {
			stack.add(vis[stack.peek()]);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}

}
