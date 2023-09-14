package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class A12852 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		arr[1] = 0;
		int[] vis = new int[n+1];
		vis[1] = 1;
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1]+1;
			vis[i] = i-1;
			if(i%3 ==0) {
				if(arr[i] > arr[i/3]+1) {
					vis[i] = i/3;
					arr[i] = Math.min(arr[i], arr[i/3]+1);
				}
			}
				
			if(i%2 ==0) {
				if(arr[i] > arr[i/2]+1) {
					vis[i] = i/2;
					arr[i] = Math.min(arr[i], arr[i/2]+1);
			
				}
		
			}
		}		
		System.out.println(arr[n]);
//		System.out.println(Arrays.toString(vis));
		Stack<Integer> stack = new Stack<>();
		stack.add(n);
		while(stack.peek() != 1) {
			stack.add(vis[stack.peek()]);
		}
		for(int i=0; i<stack.size(); i++) {
			System.out.print(stack.get(i)+ " ");
		}
	}

}
