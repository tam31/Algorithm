package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1697 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[1000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr[n] = 0;
		Queue<Integer> que = new LinkedList<>();
		que.add(n);
		
		
		while(!que.isEmpty()) {
			int num = que.poll();
			if(num == m) {
				break;
			}
			
			if(num-1>=0 && arr[num-1] == 0) {
				arr[num-1] = arr[num]+1;
				que.add(num-1);
			}
			if(num+1<=100000 && arr[num+1] == 0) {
				arr[num+1] = arr[num]+1;
				que.add(num+1);
			}
			if(num*2<=100000 && arr[num*2] == 0) {
				arr[num*2] = arr[num]+1;
				que.add(num*2);
			}
		}
		System.out.println(arr[m]);
	}

}
