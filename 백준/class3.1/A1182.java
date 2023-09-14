package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1182 {
	static int n;
	static int m;
	static int[] data;
	static boolean[] vis;
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		data = new int[n];
		vis = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		func(0,0);
		if(m==0) cnt -=1;
		System.out.println(cnt);
	}
	private static void func(int k,int sum) {
		if(k==n) {
			if(sum == m) {
				cnt +=1;
			}
			return;
		}
		
		func(k+1, sum+data[k]);
		func(k+1, sum);
	}

}
