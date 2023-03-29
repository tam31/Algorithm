package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[10];
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			arr[Integer.parseInt(st.nextToken())] = true;
		}
		
		int ans = Math.abs(n-100);
		for(int i=0; i<=999999; i++) {
			String a = String.valueOf(i);
			int b = a.length();
			
			boolean c = true;
			for(int j=0; j<b; j++) {
				if(arr[a.charAt(j)-'0']) {
					c = false;
					break;
				}
			}
			
			if(c) {
				ans = Math.min(ans, b+Math.abs(n-i));
			}
		}
		System.out.println(ans);
	}

}
