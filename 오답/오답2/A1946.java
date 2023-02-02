package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		
		for(int num=0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][2];
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr, (o1,o2) ->{
				if(o1[0]==o2[0]) {
					return o1[1]-o2[2];
				}
				return o1[0]-o2[0];
			});
			
			int k = arr[0][1];
			int cnt = 1;
			for(int i=1; i<n; i++) {
				if(k > arr[i][1]) {
					k = arr[i][1];
					cnt +=1;
				}
			}
			System.out.println(cnt);
		}
	}

}
