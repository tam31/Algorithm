package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		int cnt = 1;
		int start = 0;
		
		int m = Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(br.readLine());
			cnt *= arr[num-start-1];
			start = num;
		}
		
		cnt *= arr[n-start];
		System.out.println(cnt);
	}

}
