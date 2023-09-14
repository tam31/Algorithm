package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int ans = 0;
		String[] arr1 = str.split("-");
		for(int i=0; i<arr1.length; i++) {
			String[] arr2 = arr1[i].split("\\+");
			int sum = 0;
			for(int j=0; j<arr2.length; j++) {
				sum += Integer.parseInt(arr2[j]);
			}
			
			if(i==0) {
				ans +=sum;
			}else {
				ans -= sum;
			}
		}
		System.out.println(ans);
	}

}
