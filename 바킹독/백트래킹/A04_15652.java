package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A04_15652 {
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		func(0,1);
		System.out.println(sb);
	}
	private static void func(int k, int z) {
		if(k==m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=z; i<=n; i++) {
			arr[k] = i;
			func(k+1, i);
		}
	}

}
