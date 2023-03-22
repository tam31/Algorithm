package leve2;

public class 숫자의표현 {

	public static void main(String[] args) {
		int n = 15;
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=i; j<=n; j++) {
				sum += j;
				if(sum == n) {
					ans +=1;
					break;
				}else if(sum >n) {
					break;
				}
			}
		}
		
		System.out.println(ans);
	}

}
