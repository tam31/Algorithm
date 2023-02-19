package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A13_15665 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] vis;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		vis = new boolean[n];
		ans = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		func(0);
		System.out.println(sb);
		
		
		
	}
	private static void func(int k) {
		if(k == m) {
			for(int i=0; i<m; i++) {
				sb.append(ans[i]+" ");
			}
			sb.append("\n");
			return;
		}
		int before = 0;
		for(int i=0; i<n; i++) {
			if(before != arr[i]) {
				ans[k] = arr[i];
				before = arr[i];
				func(k+1);
			}
		}
	}

}
