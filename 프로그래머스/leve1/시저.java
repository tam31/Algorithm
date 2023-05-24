package level1;

public class 시저 {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		
		String ans = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				ans += s.charAt(i);
			}else {
				int a = s.charAt(i);
				if(a>='A' && a<='Z') {
					a = a+n;
					if(a>'Z') {
						a -= 26;
					}
					ans += (char)a;
				}else {
					a = a+n;
					if(a>'z') {
						a -= 26;
					}
					ans += (char)a;
				}
			}
		}
		System.out.println(ans);
	}

}
