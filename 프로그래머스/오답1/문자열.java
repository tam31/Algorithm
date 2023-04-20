package 오답1;
import java.util.*;
public class 문자열 {

	public static void main(String[] args) {
		String s = "for the last week";
		
		String[] str = s.toLowerCase().split("");
		String ans = "";
		boolean a = true;
		for(int i=0; i<str.length; i++) {
			ans += a ? str[i].toUpperCase() : str[i];
			if(str[i].equals(" ")) {
				a = true;
			}else {
				a = false;
			}
		}
		
		System.out.println(ans);
	}

}
