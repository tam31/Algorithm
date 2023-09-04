package 오답1;
import java.util.*;
public class A입국심사 {

	public static void main(String[] args) {
		int n = 6;
		int[] times = {7,10};
		
		
		long start = 1;
		long end = (long)n*(long)times[times.length-1];
		while(start<end) {
			long mid = (start+end)/2;
			
			long cnt = 0;
			for(int i=0; i<times.length; i++) {
				cnt += mid/times[i];
			}
			
			if(cnt>=n) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		System.out.println(start);
	}

}
