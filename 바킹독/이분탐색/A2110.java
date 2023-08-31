package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2110 {
	static int[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		int start = 1;
		int end = list[n-1]-list[0];
		while(start<end) {
			int mid = (start+end)/2;
			
			if(func(mid)<m) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		System.out.println(start-1);
	}
	private static int func(int tmp) {
		int count =1;
		int last = list[0];
		for(int i=1; i<list.length; i++) {
			if(list[i]-last>=tmp) {
				count +=1;
				last = list[i];
			}
		}
		
		return count;
	}
}
