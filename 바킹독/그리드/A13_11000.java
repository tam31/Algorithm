package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A13_11000 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
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
		
		que.add(arr[0][1]);
		int cnt = 1;
		
		for(int i=1; i<n; i++) {
			int data = que.peek();
			if(arr[i][0]>=data) {
				que.poll();
			}else {
				cnt+=1;
			}
			que.add(arr[i][1]);
//			System.out.println(que);
		}
		System.out.println(cnt);
	}

}
