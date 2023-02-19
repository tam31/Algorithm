package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15_6603 {
	static int n;
	static int[] arr;
	static boolean[] vis;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			if(n==0) break;
			else {
				arr = new int[n];
				ans = new int[6];
				vis = new boolean[n];
				
				for(int i=0; i<n; i++) {
					arr[i] = Integer.parseInt(st.nextToken());
				}
				
				func(0,0);
				sb.append("\n");
			}
		}
		System.out.println(sb);
		
		
	}
	private static void func(int k, int z) {
		if(k==6) {
			for(int i=0; i<6; i++) {
				sb.append(ans[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=z; i<n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				ans[k] = arr[i];
				func(k+1, i+1);
				vis[i] = false;
			}
		}
	}

}
