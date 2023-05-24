package level1;

public class 이상한문자 {

	public static void main(String[] args) {
		String s = "try hello world";
		
		s = s.toLowerCase();
		String ans ="";
		boolean check = true;
		for(int i=0; i<s.length(); i++) {
			if(check) {
				ans +=(char)(s.charAt(i)-'a'+'A');
				check = false;
			}else {
				ans += s.charAt(i);
				check = true;
				
			}
			if(s.charAt(i)==' ') {
				check = true;
			}
			
		}
		System.out.println(ans);
	}

}
