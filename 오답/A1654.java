package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] list = new int[n];
		long max = 0;
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, list[i]);
		}
		
		Arrays.sort(list);
		max +=1;
		long min = 0;
		int ans = 0;
		while(min<max) {
			long mid = (min+max)/2;
			int cnt = 0;
			for(int i=0; i<n; i++) {
				cnt+= list[i]/mid;
			}
			
			if(cnt<m) {
				max = mid;
			}else {
				min = mid+1;
			}
		}
		System.out.println(min-1);
	}

}
