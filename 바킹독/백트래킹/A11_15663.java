package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11_15663 {
	static int n;
	static int m;
	static int[] arr;
	static int[] ans;
	static boolean[] vis;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		ans = new int[m];
		vis = new boolean[n];
		
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
			if(!vis[i]) {
				if(before != arr[i]) {
					ans[k] = arr[i];
					vis[i] = true;
					before = arr[i];
					func(k+1);
					vis[i] = false;
				}
				
			}
		}
	}

}
