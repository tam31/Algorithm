package 이분탐색.오답;
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
		long max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, list[i]);
		}
		max +=1;
		Arrays.sort(list);
		long min = 0;
		while(min<max) {
			long mid = (min+max)/2;
			long sum = 0;
			for(int i=0; i<n; i++) {
				if(list[i]-mid >0) {
					sum += list[i]-mid;
				}
			}
			
			if(sum<m) {
				max = mid;
			}else {
				min = mid+1;
			}
		}
		System.out.println(min-1);
	}

}
