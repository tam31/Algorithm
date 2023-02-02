package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A11000 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1,o2)->{
			if(o1[0] == o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		PriorityQueue que = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			if(que.isEmpty()) {
				que.add(arr[i][1]);
			}else {
				if((int)que.peek() <= arr[i][0]) {
					que.poll();
				}
				que.add(arr[i][1]);
			}
		}
		System.out.println(que.size());
	}

}
