package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			int a =func1(tmp,list);
			int b = func2(tmp,list);
			sb.append((b-a)+" ");
		}
		System.out.println(sb);
		
		
	}
	private static int func1(int tmp, int[] list) {
		int start = 0;
		int end = list.length;
		while(start<end) {
			int mid = (start+end)/2;
			if(list[mid]<tmp) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		return start;
	}
	private static int func2(int tmp, int[] list) {
		int start = 0;
		int end = list.length;
		while(start<end) {
			int mid = (start+end)/2;
			if(list[mid]<=tmp) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		return start;
	}
	
}
