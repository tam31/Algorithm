package 이분탐색.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A3151 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		long ans = 0;
		Arrays.sort(list);
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int tmp = list[i]+list[j];
				int low = lower(j+1, n, list, -tmp);
				int up = upper(j+1,n,list,-tmp);
				ans += up-low;
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
