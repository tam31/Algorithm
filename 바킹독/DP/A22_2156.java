package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A22_2156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] vis = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		vis[0]=arr[0];
		for(int i=1; i<n; i++) {
			if(i==1) {
				vis[i] = arr[0]+arr[1];
			}else if(i==2) {
				vis[i] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
			}else {
				vis[i] = Math.max(vis[i-3]+arr[i-1]+arr[i], vis[i-2]+arr[i]);
			}
			vis[i] = Math.max(vis[i], vis[i-1]);
		}
		
		System.out.println(vis[n-1]);
	}

}
