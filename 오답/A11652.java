package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A11652 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
		
		if(n == 1) {
			System.out.println(arr[0]);
			return;
		}
		int maxCnt = 0;
		long maxVal = 0;
		int cnt = 1;
		for(int i=0; i<n-1; i++) {
			if(arr[i]!=arr[i+1]) {
				cnt =0;
			}
			
			cnt +=1;
			
			if(cnt>maxCnt) {
				maxCnt = cnt;
				maxVal = arr[i];
			}
		}
		
		System.out.println(maxVal);
	}

}
