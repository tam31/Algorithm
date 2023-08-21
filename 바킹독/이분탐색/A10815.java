package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A10815 {

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
			if(func(list,tmp)) {
				sb.append(1+" ");
			}else {
				sb.append(0+" ");
			}
		}
		System.out.println(sb);
	}
	private static boolean func(int[] list, int tmp) {
		int start = 0;
		int end = list.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(list[mid]==tmp) return true;
			if(list[mid]<tmp) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return false;
	}
}
