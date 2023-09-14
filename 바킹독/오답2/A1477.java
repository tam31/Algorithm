package 이분탐색.오답2;
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
		
		int[] list = new int[n+2];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		list[n+1] = l;
		Arrays.sort(list);
		
		int start = 1; //0이 되며 거리차이가 0이 될수도 있기때문에 안됌
		int end = l;
		while(start<end) {
			int mid = (start+end)/2;
			
			int cnt = 0;
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
