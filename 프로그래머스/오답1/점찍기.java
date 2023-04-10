package 오답1;

public class 점찍기 {

	public static void main(String[] args) {
		int k = 1;
		int d = 5;
		
		int ans = 0;
		for(int i=0; i<=d; i+=k) {
			ans += Math.sqrt(Math.pow(d, 2)-Math.pow(i, 2))/k + 1;
		}
		
		System.out.println(ans);
	}
}
