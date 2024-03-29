package 이분탐색.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A16401 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] list = new long[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			list[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(list);
		long start = 1;
		long end = 1000000000;
		while(start<end) {
			long mid = (start+end)/2;
			
			long cnt = 0;
			for(int i=0; i<m; i++) {
				cnt += list[i]/mid;
			}
			
			if(cnt>=n) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		System.out.println(start-1);
	}

}
