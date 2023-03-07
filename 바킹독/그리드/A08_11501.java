package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A08_11501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		for(int num=0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr= new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long sum = 0;
			int max = arr[n-1];
			for(int i=n-2; i>=0; i--) {
				if(arr[i] < max) {
					sum += max-arr[i];
				}else {
					max = arr[i];
				}
				
			}
			
			System.out.println(sum);
		}
	}

}
