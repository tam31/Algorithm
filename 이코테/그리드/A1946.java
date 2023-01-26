package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1946 {

	public static void main(String[] args) throws IOException{
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int nums = Integer.parseInt(br.readLine());
		for(int num = 0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			
			//2원배열
			int[][] arr = new int[n][2];
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			//배열정렬
			Arrays.sort(arr,(o1,o2)->{
				return o1[0]-o2[0];
			});
			
			int cnt = 1;
			int max = arr[0][1];
			for(int i=1; i<n; i++) {
				if(max > arr[i][1]) {
					cnt +=1;
					max = arr[i][1];
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}

}
