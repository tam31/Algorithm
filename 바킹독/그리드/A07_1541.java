package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A07_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("-");
		
		int sum = 0;
		for(int i=0; i<str.length; i++) {
			String[] arr = str[i].split("\\+");
			int cnt = 0;
			for(int j=0; j<arr.length; j++) {
				cnt += Integer.parseInt(arr[j]);
			}
			
			if(i==0) {
				sum += cnt;
			}else {
				sum -=cnt;
			}
		}
		System.out.println(sum);
	}

}
