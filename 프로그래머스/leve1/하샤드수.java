package 일차3;

public class 하샤드수 {

	public static void main(String[] args) {
		int n = 10;
		
		String str = String.valueOf(n);
		int num = 0;
		for(int i=0; i<str.length(); i++) {
			num += str.charAt(i)-'0';
		}
		if(n%num==0) {
			System.out.println(true);
		}
	}

}
