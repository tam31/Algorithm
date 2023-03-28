package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1182 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] vis;
	static int ans = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		vis = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		func(0,0,0);
		if(m==0) ans -=1;
		System.out.println(ans);
	}
	private static void func(int idx, int start, int sum) {
		if(sum == m) {
			ans +=1;
			//return;
		}
		for(int i=start; i<n; i++) {
			if(!vis[i]) {
				vis[i]= true;
				func(idx+1, i+1, sum+arr[i]);
				vis[i]=false;
			}
		}
	}
}
