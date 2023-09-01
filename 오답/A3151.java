package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A3151 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		long ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int tmp = list[i]+list[j];
				int start = lower(j+1,n,list,tmp*-1);
				int end = upper(j+1,n,list,tmp*-1);
				
				ans += end-start;
			}
		}
		System.out.println(ans);
	}
	private static int lower(int start, int end, int[] list, int tmp) {
		while(start<end) {
			int mid = (start+end)/2;
			if(list[mid]>=tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}

	private static int upper(int start, int end, int[] list, int tmp) {
		while(start<end) {
			int mid = (start+end)/2;
			if(list[mid]>tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
}
