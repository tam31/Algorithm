package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = 1;
		}
		
		
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(k!=i) {
					if(arr[k][0] < arr[i][0] && arr[k][1] < arr[i][1]) {
						arr[k][2] +=1;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][2]+" ");
		}
			
		System.out.println(sb);

	}

}
