package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A02_15650 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] vis;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		vis = new boolean[n+1];
		sb = new StringBuilder();
	
		func(0,1);
		System.out.println(sb);
	}
	private static void func(int k, int z) {
		if(k == m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=z; i<=n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				arr[k] = i;
				func(k+1, i+1);
				vis[i] = false;
			}
		}
	}

}
