package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			int re = upper(list,tmp)-lower(list,tmp);
			sb.append(re+" ");
		}
		System.out.println(sb);
	}
	private static int lower(int[] list,int tmp) {
		int start = 0;
		int end = list.length;
		while(start<end) {
			
			int mid = (start+end)/2;
			if(list[mid] >=tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
	
	private static int upper(int[] list, int tmp) {
		int start = 0;
		int end = list.length;
		while(start<end) {
			int mid = (start+end)/2;
			if(list[mid]> tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
}
