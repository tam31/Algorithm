package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A13 {
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int f = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int u = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		arr = new int[f+1];
		arr[s] = 1;
		
		Queue<Integer> que = new LinkedList<>();
		que.add(s);
		
		while(!que.isEmpty()) {
			int data = que.poll();
			
			if(data == g) {
				break;
			}
			if(data-d>0 && arr[data-d] == 0) {
				arr[data-d] = arr[data] + 1;
				que.add(data-d);
			}
			if(data+u<=f && arr[data+u] == 0) {
				arr[data+u] = arr[data] + 1;
				que.add(data+u);
			}
		}
		if(arr[g] == 0) {
			System.out.println("use the stairs");
		}else {
			System.out.println(arr[g]-1);
		}
	}

}
