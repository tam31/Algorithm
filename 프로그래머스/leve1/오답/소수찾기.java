package 오답1;

import java.util.Arrays;

public class 소수찾기 {

	public static void main(String[] args) {
		int n = 5;
		
		int cnt = 0;
		int[] data = new int[n+1];
		for(int i=2; i<=Math.sqrt(n+1); i++) {
			if(data[i] == 1) {
				continue;
			}
			for(int j=i*2; j<=n; j+=i) {
				data[j] = 1 ;
			}
		}
		
		for(int i=2; i<=n; i++) {
			if(data[i] == 0) {
				cnt +=1;
			}
		}
		System.out.println(Arrays.toString(data));
		System.out.println(cnt);
		
	}

}
