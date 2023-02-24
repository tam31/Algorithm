package Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A07_12852 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		int[] vis = new int[n+1];
		
		arr[1] = 0;
		vis[1] = 0;
		
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1]+1;
			vis[i] = i-1;
			if(i%2==0 && arr[i] > arr[i/2]+1) {
				arr[i] = arr[i/2]+1;
				vis[i] = i/2;
			}
			if(i%3==0 && arr[i]> arr[i/3]+1) {
				arr[i] = arr[i/3]+1;
				vis[i] = i/3;
			}
		}
		
		System.out.println(arr[n]);
		int now = n;
		while(true) {
			System.out.printf("%d ",now);
			if(now == 1) break;
			now = vis[now];
		}
	}

}
