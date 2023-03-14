package 일차3;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		long n = 3;
		
		long ans = -1;
		long num = (long)Math.sqrt(n);
		if(num*num == n) {
			ans = (num+1)*(num+1);
		}
		System.out.println(ans);
	}

}
