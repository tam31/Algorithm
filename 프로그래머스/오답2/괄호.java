package 오답2;
import java.util.*;
public class 괄호 {

	public static void main(String[] args) {
		String s = ")()(";
		
		boolean ans= true;
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				cnt +=1;
			}else {
				cnt -=1;
			}
			if(cnt <0) {
				ans = false;
				break;
			}
		}
		
		if(cnt !=0) {
			ans = false;
		}
		System.out.println(ans);
	}

}
