package 일차3;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n =3;
		int m = 12;
		
		int a = gcd(n,m);
		int b = (n*m)/a;
		System.out.println(b);
	}

	private static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}else {
			return gcd(b,(a%b));
		}
		
		
	
	}
	
	
	

}
