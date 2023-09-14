package 오답2;

import java.util.Arrays;
import java.util.Scanner;

public class A5648 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(sc.next());
			arr[i] = Long.parseLong(sb.reverse().toString());
		}
		Arrays.sort(arr);
		for(long k: arr) {
			System.out.println(k);
		}
	}

}
