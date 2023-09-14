package 이분탐색.오답;
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
		
		int[] list = new int[m];
		long min = 0;
		long max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, list[i]);
		}
		
		max +=1;
		Arrays.sort(list);
		while(min<max) {
			long mid = (min+max)/2;
			int cnt = 0;
			for(int i=0; i<m; i++) {
				cnt += list[i]/mid;
			}
			
			if(cnt<n) {
				max = mid;
			}else {
				min = mid+1;
			}
		}
		if(min==0) {
			System.out.println(0);
		}else {
			System.out.println(min-1);
		}
	}
}
