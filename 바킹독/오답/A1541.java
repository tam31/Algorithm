package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("-");
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			String[] ans = arr[i].split("\\+");
			int add = 0;
			for(int j=0; j<ans.length; j++) {
				add += Integer.parseInt(ans[j]);
			}
			if(i==0) {
				sum += add;
			}else {
				sum -=add;
			}
		}
		System.out.println(sum);
	}

}
