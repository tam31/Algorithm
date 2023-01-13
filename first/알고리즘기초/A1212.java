package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A1212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String arr[] = {"000","001","010","011","100","101","110","111"};
		String str = br.readLine();
		for(int i = 0; i<str.length(); i++) {
			sb.append(arr[str.charAt(i)-'0']); //문자열이기 때문에 문자 0을 빼줘야함(자동형 변환으로 문자를 숫자로 아스키코드로 변환하여 나타냄)
		}
		if(str.equals("0")) {
			System.out.println(0);
		}else {
			while(sb.charAt(0)=='0') {
				sb = new StringBuilder(sb.substring(1)); //적용이 안되서 변수 설정해줘야함
			}
			System.out.println(sb);
		}
		
	}

}
