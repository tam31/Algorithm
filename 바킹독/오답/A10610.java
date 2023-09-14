package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		
		//모든 자리수의 합들이 3의 배수여야한다
		//0이 무조건 있어야한다
		//최대값으로 내림차순으로 구한다.
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		int sum = 0;
		for(int i=arr.length-1; i>=0; i--) {
			sum += arr[i]-'0';
			sb.append(arr[i]-'0');
		}
		
		if(sum % 3 != 0 || arr[0] != '0') {
			System.out.println(-1);
		}else {
			System.out.println(sb.toString());
		}
		
	}

}
