package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] list = new int[n];
		st = new StringTokenizer(br.readLine());
		int start = 0;
		int end = 0;
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			end = Math.max(end, list[i]);
		}
		
		Arrays.sort(list);
		while(start<end) {
			int mid = (start+end)/2;
			long add = 0;
			for(int i=0; i<n; i++) {
				if(mid<list[i]) {
					add += list[i]-mid;
				}
			}
			
			if(add<m) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		System.out.println(start -1);
	}

}
