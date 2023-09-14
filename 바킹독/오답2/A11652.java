package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A11652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
		int cnt=1;
		int maxCnt = 0;
		long max = arr[0];
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				cnt = 0;
			}
			cnt +=1;
			if(maxCnt < cnt) {
				max = arr[i];
				maxCnt = cnt;
			}
		}
		System.out.println(max);
	}

}
