package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A15_2170 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i][0] = a;
			arr[i][1] =b;
		}
		
		Arrays.sort(arr,(o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
	
		int min = arr[0][0];
		int max = arr[0][1];
		int len = max-min;
		for(int i=1; i<n; i++) {
			if(min>=arr[i][0] && max>=arr[i][1]) {
				continue;
			}else if(max> arr[i][0]) {
				len += arr[i][1]-max;
			}else {
				len+= arr[i][1]-arr[i][0];
			}
			
			min=arr[i][0];
			max=arr[i][1];
		}
		System.out.println(len);
	}

}
