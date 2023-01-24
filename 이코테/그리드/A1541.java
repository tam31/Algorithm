package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("-");
//		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<str.length; i++) {
			String[] num = str[i].split("\\+");
			int sum =0;
			for(int j=0; j<num.length; j++) {
				sum += Integer.parseInt(num[j]);
//				System.out.println(num[j]);
			}
			str[i] = Integer.toString(sum);
		}
		
		int ans = Integer.parseInt(str[0]);
		for(int i=1; i<str.length; i++) {
			ans-=Integer.parseInt(str[i]);
		}
		
		System.out.println(ans);
	}

}
