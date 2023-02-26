package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class A21_14002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] vis = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.fill(vis, 1);
		
		int max = 1;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					vis[i] = Math.max(vis[j]+1, vis[i]);
				}
			}
			max = Math.max(max, vis[i]);
		}
		System.out.println(max);
//		System.out.println(Arrays.toString(vis));
		
		Stack<Integer> stack = new Stack<>();
		for(int i=n-1; i>=0; i--) {
			if(max == vis[i]) {
				stack.add(arr[i]);
				max -=1;
			}
		}
		while(!stack.isEmpty()) {
			System.out.printf("%d ", stack.pop());
		}
	}

}
