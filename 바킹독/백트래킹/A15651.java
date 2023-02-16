package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15651 {
	static int n;
	static int m;
	static boolean[] vis;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		vis = new boolean[n+1];
		
		func(0);
		System.out.println(sb);
	}
	private static void func(int k) {
		if(k == m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!vis[i]) {
				arr[k] = i;
				func(k+1);
			}
		}
	}

}
