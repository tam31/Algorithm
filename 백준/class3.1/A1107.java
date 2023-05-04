package class3;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1107 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int ans = Math.abs(Integer.parseInt(str)-100);
		int n = Integer.parseInt(br.readLine());
		boolean[] not = new boolean[10];
		if(n!=0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				not[Integer.parseInt(st.nextToken())] = true;
			}
		}

		for(int i=0; i<=999999; i++) {
			String a = String.valueOf(i);
			int len = a.length();
			
			boolean check = true;
			for(int j=0; j<len; j++) {
				if(not[a.charAt(j)-'0']) {
					check=false;
					break;
				}
			}
			
			if(check) {
				int num = Math.abs(Integer.parseInt(str)- i)+len;
				ans = Math.min(ans, num);
			}
		}
		System.out.println(ans);
	}

}
