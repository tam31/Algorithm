package level1;

public class 시저암호 {

	public static void main(String[] args) {
		String s = "P";
		int n = 15;
		String ans = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				ans += " ";
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				ans += (char)('a'+(s.charAt(i)+n-'a')%26);
			}else {
				ans += (char)('A'+ (s.charAt(i)+n-'A')%26);
			}
			
			
		}
		System.out.println(ans);
	}

}
