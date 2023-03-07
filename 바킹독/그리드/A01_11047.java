package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A01_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		for(int i=n-1; i>=0; i--) {
			if(arr[i] <= k) {
				cnt += k/arr[i];
				k = k%arr[i];
			}
		}
		System.out.println(cnt);
	}

}
