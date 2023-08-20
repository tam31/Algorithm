package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1654 {
	static int n,m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		long max = 0;
		int[] list = new int[n];
		
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, list[i]);
		}
		
		long min = 0;
		while(min<max) {
			long mid = (min+max+1)/2;
			if(func(mid, list)) {
				min = mid;
			}else {
				max = mid-1;
			}
		}
		System.out.println(min);
	}
	private static boolean func(long tmp, int[] list) {
		int cnt = 0;
		for(int i=0; i<n; i++) {
			cnt += list[i]/tmp;
		}
		if(cnt>=m) {
			return true;
		}else {
			return false;
		}
		
	}
}
