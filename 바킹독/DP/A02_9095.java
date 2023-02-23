package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A02_9095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[12];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=4; i<12; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[Integer.parseInt(br.readLine())]);
		}
	}

}
