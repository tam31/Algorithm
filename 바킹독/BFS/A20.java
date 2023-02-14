package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[100001];
		Arrays.fill(arr, -1);
		arr[n] = 0;
		Queue<Integer> que = new LinkedList<>();
		que.add(n);
		
		while(true) {
			int data = que.poll();
			if(data == m) {
				System.out.println(arr[m]);
				return;
			}
			
			if(data*2<=100000 && arr[data*2] == -1) {
				arr[data*2] = arr[data];
				que.add(data*2);
			}
			
			if(data-1>=0 && arr[data-1] == -1) {
				arr[data-1] = arr[data]+1;
				que.add(data-1);
			}
			if(data+1<=100000 && arr[data+1]==-1) {
				arr[data+1] = arr[data]+1;
				que.add(data+1);
			}
			
			
		}
	}

}
