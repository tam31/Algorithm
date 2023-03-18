package 일차6;

import java.util.ArrayList;

public class 옹알이 {

	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		
		String[] list = {"aya", "ye", "woo", "ma"};
		int cnt = 0;
		
		for(int i=0; i<babbling.length; i++) {
			String str = babbling[i];
			
			String a = "";
			int now = -1;
			for(int j=0; j<str.length(); j++) {
				a += str.charAt(j);
				for(int z=0; z<list.length; z++) {
					if(a.equals(list[z]) && now != z) {
						a="";
						now = z;
					}
				}
			}
			if(a.equals("")) {
				cnt +=1;
			}
		}
		System.out.println(cnt);
	}

}
