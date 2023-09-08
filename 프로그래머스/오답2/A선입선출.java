package 오답2;
import java.util.*;
public class A선입선출 {

	public static void main(String[] args) {
		int n = 6;
		int[] cores = {1,2,3};
		
		int m = cores.length;
		if(n<=m) {
			System.out.println(n);
		}else {
			n -= m;
			Arrays.sort(cores);
			long start = 1;
			long end =  (long)cores[m-1]*(long)n;
			while(start<end) {
				long mid = (start+end)/2;
				
				long cnt = 0;
				for(int i=0; i<m; i++) {
					cnt += mid/cores[i];
				}
				
				if(cnt>=n) {
					end = mid;
				}else {
					start = mid+1;
				}
			}
			
			for(int i=0; i<m; i++) {
				n-= (start-1)/cores[i];
			}
			
			int ans = 0;
			for(int i=0; i<m; i++) {
				if(start%cores[i] ==0) {
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
