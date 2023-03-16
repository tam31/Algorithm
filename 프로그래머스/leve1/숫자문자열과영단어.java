package 일차5;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		String s ="23four5six7";
		
		String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for(int i=0; i<10; i++) {
			s= s.replaceAll(arr[i], Integer.toString(i));
		}
		System.out.println(s);
//		String ans = "";
//		
//		String check = "";
//		for(int i=0; i<s.length(); i++) {
//			check += s.charAt(i);
//			System.out.println(check);
//			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
//				ans += s.charAt(i);
//				check="";
//			}
//			switch(check) {
//			case "one":
//				ans += 1;
//				check = "";
//				break;
//			case "two":
//				ans +=2;
//				break;
//			case "three":
//				ans +=3;
//				check = "";
//				break;
//			case "four":
//				ans += 4;
//				check = "";
//				break;
//			case "five":
//				ans += 5;
//				check = "";
//				break;
//			case "six":
//				ans += 6;
//				check = "";
//				break;
//			case "seven":
//				ans += 7;
//				check = "";
//				break;
//			case "eight":
//				ans += 8;
//				check = "";
//				break;
//			case "nine":
//				ans += 9;
//				check = "";
//				break;
//			case "zero":
//				ans += 0;
//				check = "";
//				break;
//			}
//
//		}
//		
//		System.out.println(ans);
	}

}
