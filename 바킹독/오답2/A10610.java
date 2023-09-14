package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] n = br.readLine().toCharArray();
		
		Arrays.sort(n);
		
		int sum = 0;
		for(int i=0; i<n.length; i++) {
			sum += (int)n[i];
		}
		
		if(n[0] == '0' && sum %3 ==0) {
			for(int i=0; i<n.length; i++) {
				System.out.print(n[n.length-1-i]);
			}
		}else {
			System.out.println(-1);
		}
	}

}
