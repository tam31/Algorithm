package 이분탐색.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] list = new long[n];
		for(int i=0; i<n; i++) {
			list[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(list);
		long start = 1;
		long end = 1000000000+1;
		while(start<end) {
			long mid = (start+end)/2;
			
			long cnt = 1;
			long first = list[0];
			for(int i=1; i<n; i++) {
				if(list[i]-first >= mid) {
					cnt +=1;
					first = list[i];
				}
			}
			
			if(cnt>=m) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		System.out.println(start-1);
	}

}
