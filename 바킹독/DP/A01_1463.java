package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A01_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		

		for(int i=1; i<=n; i++) {
			arr[i] = i;
			if(i==1) {
				arr[1] = 0;
				continue;
			}
			
			if(i%3==0) {
				arr[i] =Math.min(arr[i], arr[i/3] +1);
			}
			
			if(i%2 == 0) {
				arr[i] = Math.min(arr[i], arr[i/2]+1);
			}
			
			arr[i] = Math.min(arr[i], arr[i-1]+1);
		}
		System.out.println(arr[n]);
	}

}
