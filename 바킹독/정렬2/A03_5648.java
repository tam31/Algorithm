package 정렬2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class A03_5648 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(sc.nextLong());
			arr[i] = Long.parseLong(sb.reverse().toString());
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
