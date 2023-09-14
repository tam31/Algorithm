package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1477 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] list = new int[n+2];
		for(int i=1; i<=n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		list[n+1] = l;
		
		Arrays.sort(list);
		int start = 1;
		int end = l-1;
		while(start<end) {
			int mid = (start+end)/2;
			
			long cnt = 0;
			for(int i=1; i<n+2; i++) {
				cnt += (list[i]-list[i-1]-1)/mid;
			}
			
			if(cnt>m) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		System.out.println(start);
	}

}
