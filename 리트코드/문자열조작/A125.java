package 문자열조작;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A125 {

	public static void main(String[] args) {
		//간단하게
		String s = "ab_a";
		String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String b = new StringBuffer(a).reverse().toString();
		boolean ans = a.equals(b);
		System.out.println(ans);
		
		//내가 푼 방식
//		String a ="";
//		for(int i =0; i<s.length(); i++) {
//			if('A'<=s.charAt(i) && s.charAt(i)<='z') {
////				System.out.println(s.charAt(i));
//				if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
//					a+=(char)(s.charAt(i)+32);
//				}else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
//					a+=s.charAt(i);
//				}
//			}else {
//				if(48<=s.charAt(i)&&s.charAt(i)<=57) {
//					a+=s.charAt(i);
////					System.out.println(s.charAt(i));
//				}
//			}
//		}
////		System.out.println(a);
//		
//		String b ="";
//		for(int i=a.length()-1; i>=0; i--) {
//			b+=a.charAt(i);
//		}
//
//		boolean ans = false;
//		if(a.equals(b)) {
//			ans = true;
//		}
//		System.out.println(ans);
	}

}
