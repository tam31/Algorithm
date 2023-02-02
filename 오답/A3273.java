package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A3273 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] b = new int[2000000];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int k = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(k-arr[i] > 0) {
				if(b[k-arr[i]]==1) {
					cnt +=1;
				}
			}
			b[arr[i]] = 1;
		}
		
		System.out.println(cnt);
	}

}
