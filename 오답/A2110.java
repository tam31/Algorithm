package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2110 {
	static int n;
	static int m;
	static long[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new long[n];
		for(int i=0; i<n; i++) {
			list[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(list);
		long start = 1;
		long end = list[n-1]-list[0]+1;
		while(start<end) {
			long mid = (start+end)/2;
			
			int cnt = 1;
			long last = list[0];
			for(int i=1; i<n; i++) {
				if(list[i]-last>=mid) {
					cnt +=1;
					last = list[i];
				}
			}
			
//			System.out.println(mid+" "+cnt);
			if(cnt>=m) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		System.out.println(start-1);
	}

}
