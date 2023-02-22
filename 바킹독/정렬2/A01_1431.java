package 정렬2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A01_1431 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, (o1,o2)->{
			if(o1.length() == o2.length()) {
				int cnt1 =0, cnt2 = 0;
				
				for(int i=0; i<o1.length(); i++) {
					if(o1.charAt(i)>='0' && o1.charAt(i)<='9') {
						cnt1+= o1.charAt(i)-'0';
					}
					
				}
				for(int i=0; i<o2.length(); i++) {
					if(o2.charAt(i)>='0' && o2.charAt(i)<='9') {
						cnt2+= o2.charAt(i)-'0';
					}
				}
				
				if(cnt1==cnt2) {
					return o1.compareTo(o2);
				}else {
					return cnt1-cnt2;
				}
				
			}
			return o1.length() - o2.length();
		});
		
		
		for(String k:arr) {
			System.out.println(k);
		}
	}

}
