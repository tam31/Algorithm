package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int m = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[10];
		if(m != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++) {
				arr[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int ans = Math.abs(n-100);
		for(int i=0; i<=999999; i++) {
			String str = String.valueOf(i);
			int len = str.length();
			
			boolean check = true;
			for(int j=0; j<len; j++) {
				if(arr[str.charAt(j)-'0']) {
					check = false;
					break;
				}
			}
			if(check) {
				int num = len + Math.abs(n-i);
				ans = Math.min(ans, num);
			}
			
			
			
		}
		
		System.out.println(ans);
		
	}

}
