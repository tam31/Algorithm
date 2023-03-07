package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10_2847 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		int num = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			if(num<=arr[i]) {
				ans += arr[i]-(num-1);
				num = num-1;
			}else {
				num = arr[i];
			}
		}
		System.out.println(ans);
	}

}
