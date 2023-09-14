package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10819 {
	static int n;
	static int[] data;
	static int[] tmp;
	static boolean[] vis;
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		data = new int[n];
		tmp = new int[n];
		vis = new boolean[n];
		for(int i=0; i<n; i++) {
			data[i]= Integer.parseInt(st.nextToken());
		}
		
		func(0);
		System.out.println(ans);
		
		
		
	}
	private static void func(int idx) {
		if(idx==n) {
			int sum = 0;
			for(int i=0; i<n-1; i++) {
				sum += Math.abs(tmp[i]-tmp[i+1]);
			}
			ans = Math.max(ans, sum);
			return;
		}
		for(int i=0; i<n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				tmp[idx] = data[i];
				func(idx+1);
				vis[i] = false;
			}
		}
	}

}
