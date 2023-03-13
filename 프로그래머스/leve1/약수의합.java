package level1;

public class 약수의합 {

	public static void main(String[] args) {
		int n = 12;
		
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				cnt +=i;
			}
		}
		System.out.println(cnt);
	}

}
