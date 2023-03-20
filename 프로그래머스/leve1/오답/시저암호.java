package 오답1;

public class 시저암호 {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		
		String ans ="";
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			if(a>='A'&&a<='Z') {
				a = (char)('A'+(a-'A'+n)%26);
			}else if(a>='a'&&a<='z') {
				a = (char)('a'+(a-'a'+n)%26);
			}
			ans += a;
		}
		System.out.println(ans);
	}

}
