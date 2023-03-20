package 오답1;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "try hello world";
		
		String[] str = s.split("");
		int idx = 0;
		String a = "";
		for(int i=0; i<s.length(); i++) {
			if(str[i].equals(" ")) {
				idx = 0;
				
			}else if(idx % 2 == 0) {
				str[i] = str[i].toUpperCase();
				idx +=1;
			}else {
				str[i] = str[i].toLowerCase();
				idx +=1;
			}
			a += str[i];
		}
		
		System.out.println(a);
	}

}
