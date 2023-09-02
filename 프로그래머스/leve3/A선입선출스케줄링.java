package leve3;
import java.util.*;
public class A선입선출스케줄링 {

	public static void main(String[] args) {
		int n = 6;
		int[] cores = {1,2,3};
		
		n -= cores.length;
		int start = 0;
		int end = 50000;
		while(start<end) {
			int mid = (start+end)/2;
			
			int cnt = 0;
			for(int i=0; i<cores.length; i++) {
				cnt += mid/cores[i];
			}
			
			if(cnt>=n) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
//		System.out.println(start-1);
		for(int tmp:cores) {
			n-= (start-1)/tmp;
		}
		
		int ans = 0;
		for(int i=0; i<cores.length; i++) {
			if(start%cores[i]==0) {
				n-=1;
			}
			if(n==0) {
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);
	}

}
