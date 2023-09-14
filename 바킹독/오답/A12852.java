package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A12852 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		int[] vis = new int[n+1];
		arr[1] = 0;
		for(int i=2; i<n+1; i++) {
			arr[i] = arr[i-1]+1;
			vis[i] = i-1;
			if(i%3==0 && arr[i/3]+1 < arr[i]) {
				arr[i] = arr[i/3]+1;
				vis[i] = i/3;
			}
			if(i%2==0 && arr[i]>arr[i/2]+1) {
				arr[i] = arr[i/2]+1;
				vis[i] = i/2;
			}
		}
		
		System.out.println(arr[n]);
		System.out.printf("%d ", n);
		int now = n;
		while(now!=1) {
			System.out.printf("%d ", vis[now]);
			now = vis[now];
		}
		
	}

}
