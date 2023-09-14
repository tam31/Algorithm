package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

public class A1431 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, (o1,o2)->{
			if(o1.length() == o2.length()) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int i=0; i<o1.length(); i++) {
					if(o1.charAt(i)>='0' && o1.charAt(i)<='9') {
						cnt1 += o1.charAt(i)-'0';
					}
				}
				
				for(int i=0; i<o2.length(); i++) {
					if(o2.charAt(i)>='0' && o2.charAt(i)<='9') {
						cnt2 += o2.charAt(i)-'0';
					}
				}
				
				if(cnt1!=cnt2) {
					return cnt1-cnt2;
				}else {
					return o1.compareTo(o2);
				}
			}
			return o1.length()-o2.length();
		});
		
		for(String k : arr) {
			System.out.println(k);
		}
	}

}
