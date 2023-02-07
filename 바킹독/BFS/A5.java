package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A5 {
	static int n;
	static int k;
	static int[] arr = new int[100001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[200001];
		arr[n] = 0;
		
		int result = bfs(n);
		System.out.println(result);
		
	}
	
	private static int bfs(int n2) {
		Queue<Integer> que = new LinkedList<>();
		que.add(n2);
		int index = n2;
		int n = 0;
		
		while(!que.isEmpty()) {
			n = que.poll();
			if(n == k) {
				
				return arr[n];
			}
			if(n-1 >=0 && arr[n-1] == 0) {
				arr[n-1] = arr[n]+1;
				que.add(n-1);
			}
			if(n+1<=100000 && arr[n+1] == 0) {
				arr[n+1] = arr[n]+1;
				que.add(n+1);
			}
			if(n*2<=100000 && arr[n*2] == 0) {
				arr[n*2] = arr[n]+1;
				que.add(n*2);
			}
		}
		return -1;
	}

}
