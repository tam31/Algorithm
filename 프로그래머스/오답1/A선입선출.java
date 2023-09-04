package 오답1;
import java.util.*;
public class A선입선출 {

	public static void main(String[] args) {
		int n = 6;
		int[] cores = {1,2,3};
		
		
		if(n<=cores.length) {
			System.out.println(n);
		}else {
			n -= cores.length;
			
			int start = 0;
			int end = cores[cores.length-1]*n;
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
			
			for(int i=0; i<cores.length; i++) {
				n -= (start-1)/cores[i];
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

}
