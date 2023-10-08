package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A3020 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
	
		long[] list = new long[(int)n];
		long min = Long.MAX_VALUE;
		long max = 0;
		for(int i=0; i<n; i++) {
			list[i] = Long.parseLong(br.readLine());
			max = Math.max(list[i], max);
			min = Math.min(min, list[i]);
		}
		
		max *=m;
		while(min<max) {
			long mid = (min+max)/2;
			long cnt = func(list,mid,m);
			
			if(cnt>=m) {
				max = mid;
			}else {
				min = mid+1;
			}
		}
		System.out.println(min);
	}

	private static long func(long[] list, long mid,long m) {
		long cnt = 0;
		for(int i=0; i<list.length; i++) {
			cnt += mid/list[i];
			if(cnt>m) {
				break;
			}
		}
		return cnt;
	}
	
}
