package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A2170 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		int start = arr[0][0];
		int end = arr[0][1];
		int len = end-start;
		
		for(int i=1; i<n; i++) {
			if(arr[i][0]>=start && arr[i][1] <=end) {
				continue;
			}else if(arr[i][0] <= end) {
				len += arr[i][1]-end;
			}else {
				len += arr[i][1] - arr[i][0];
			}
			
			start = arr[i][0];
			end = arr[i][1];
		}
		System.out.println(len);
	}

}
