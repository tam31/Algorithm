package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1477 {
	static int n;
	static int m;
	static int l;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		
		int[] list = new int[n+2];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		list[0] = 0;
		list[n+1] = l;
		Arrays.sort(list);
		int start = 1;
		int end = l;
		while(start<end) {
			int mid = (start+end)/2;
			
			int cnt = 0;
			for(int i=1; i<n+2; i++) {
				cnt += (list[i]-list[i-1]-1)/mid;
			}
			
			if(cnt<=m) {
				end = mid;
			}else {
				start=mid+1;
			}
		}
		
		System.out.println(start);
		
	}

}
