package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10819 {
	static int n;
	static int[] data;
	static boolean[] vis;
	static int[] re;
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		data = new int[n];
		vis = new boolean[n];
		re = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		func(0);
		System.out.println(ans);
	}
	private static void func(int idx) {
		if(idx == n) {
			int sum = 0;
			for(int i=0; i<n-1; i++) {
				sum += Math.abs(re[i] - re[i+1]);
			}
			ans = Math.max(ans, sum);
		}
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				re[idx] = data[i];
				vis[i] = true;
				func(idx+1);
				vis[i] = false;
			}
		}
	}

}
