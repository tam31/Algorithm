package level1;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "LLHLLL lHlL ";
		String ans = "";
		String[] str = s.split("");
		
		
		int idx = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(" ")) {
				idx = 0;
			}else if(idx % 2 == 0) {
				str[i] = str[i].toUpperCase();
				idx +=1;
			}else {
				str[i] = str[i].toLowerCase();
				idx +=1;
			}
			ans += str[i];
		}
		System.out.println(ans);
		
	}

}
