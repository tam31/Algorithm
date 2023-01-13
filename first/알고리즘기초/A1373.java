package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1373 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
//		int cnt = 0; int add = 0;
//		for(int i= str.length()-1; i>=0; i--) {
//			if(cnt == 3) {
//				cnt = 0;
//				sb.append(add);
//				add = 0;
//			}
////			System.out.println("str.charat(i): "+ (str.charAt(i)-'0'));
//			if(str.charAt(i)-'0' == 1) {
//				add += (int)Math.pow(2, cnt);
//			}
//			cnt +=1;
//		}
//		sb.append(add);
//		System.out.println(sb.reverse());
//		
		if(str.length() % 3 == 1) {
			sb.append(str.charAt(0)-'0');
		}
		else if(str.length() % 3 == 2) {
			sb.append((str.charAt(0)-'0')*2+(str.charAt(1)-'0'));
		}
		
		for(int i = str.length() % 3; i<str.length(); i+=3) {
			sb.append((str.charAt(i)-'0')*4+(str.charAt(i+1)-'0')*2+(str.charAt(i+2)-'0'));
		}
		System.out.println(sb);
	}

}
