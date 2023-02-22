package 정렬2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A06_11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			String ans="";
			for(int j=i; j<n; j++) {
				ans += str.charAt(j);
			}
			arr[i] = ans;
		}
		Arrays.sort(arr,(o1,o2)->{
			return o1.compareTo(o2);
		});
		
		for(String k:arr) {
			System.out.println(k);
		}
	}

}
