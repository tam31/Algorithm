package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int ans=0;
		boolean check = false;
		for(int i=0; i<n; i++) {
			int sum = i;
			String str = Integer.toString(i);
			for(int j =0; j<str.length(); j++) {
				sum += str.charAt(j)-'0';
			}
			if(sum == n) {
				ans = i;
				check= true;
				break;
			}
		}
		if(check) {
			System.out.println(ans);
		}else {
			System.out.println(0);
		}

	}

}
