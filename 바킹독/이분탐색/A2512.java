package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2512 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] list = new int[n];
		int end = 0;
		long add = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			end = Math.max(end, list[i]);
			add += list[i];
		}
		
		int m = Integer.parseInt(br.readLine());
		
		if(add<=m) {
			System.out.println(end);
		}else {
			Arrays.sort(list);
			
			int start = 0;
			
			while(start<end) {
				int mid = (start+end)/2;
				
				long sum = 0;
				for(int i=0; i<n; i++) {
					if(list[i]>=mid) {
						sum += mid;
					}else {
						sum +=list[i];
					}
				}
				
				if(sum>m) {
					end = mid;
				}else {
					start = mid+1;
				}
			}
			System.out.println(start-1);
		}
		
		
	}

}
