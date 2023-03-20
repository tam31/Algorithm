package 오답1;

public class x만큼간격 {

	public static void main(String[] args) {
		long x = 2;
		int n = 5;
		
		long[] ans = new long[n];
		for(int i=0; i<n; i++) {
			ans[i] = x*(i+1);
		}
	}

}
