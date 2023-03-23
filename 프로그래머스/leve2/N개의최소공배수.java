package leve2;

public class N개의최소공배수 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		int ans =arr[0];
		for(int i=1; i<arr.length; i++) {
			int num = gcd(ans, arr[i]);
			ans = (ans*arr[i])/num;
		}
		System.out.println(ans);
	}
	static private int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
