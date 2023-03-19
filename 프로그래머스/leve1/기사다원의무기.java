package 일차7;

import java.util.Arrays;

public class 기사다원의무기 {

	public static void main(String[] args) {
		int number = 10;
		int limit = 3;
		int power = 2;
		
				
		int[] data = new int[number+1];
		for(int i=1; i<=number; i++) {
			for(int j=1; j*j<=i; j++) {
				if(j*j==i) {
					data[i] +=1;
				}else if(i%j==0) {
					data[i] +=2;
				}
			}
		}
		int cnt = 0;
		for(int i=1; i<=number; i++) {
			if(data[i]>limit) {
				cnt += power;
			}else {
				cnt += data[i];
			}
		}
		System.out.println(cnt);
	}

}
