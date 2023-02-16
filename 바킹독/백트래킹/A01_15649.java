package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A01_15649 {
	static int n;
	static int m;
	static boolean[] isused;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[10];
		isused = new boolean[10];
		
		back(0);
		System.out.println(sb);
	}
	private static void back(int k) {
		if(k==m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!isused[i]) {
				arr[k] = i;
				isused[i] = true;
				back(k+1);
				isused[i] = false;
			}
		}
	}

}
