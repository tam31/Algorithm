package leve2;
import java.util.*;
public class A조이스틱 {

	public static void main(String[] args) {
		String name = "JEROEN";
		
		int move = name.length()-1;
		int ans = 0;
		for(int i=0; i<name.length(); i++) {
			ans += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
			
			int idx = i+1;
			while(idx<name.length() && name.charAt(idx)=='A') {
				idx +=1;
			}
			
			move = Math.min(move, i*2+name.length()-idx);
			move = Math.min(move, (name.length()-idx)*2+i);
		}
		System.out.println(ans+move);
	}

}
