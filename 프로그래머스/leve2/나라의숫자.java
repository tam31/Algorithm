package leve2;

public class 나라의숫자 {

	public static void main(String[] args) {
		int n = 10;
		String[] arr = {"4","1","2"};
		
		String ans = "";
		while(n!=0) {
			int num = n%3;
			n = n/3;
			if(num == 0) n -=1;
			ans = arr[num]+ans;
		}
		System.out.println(ans);
	}

}
