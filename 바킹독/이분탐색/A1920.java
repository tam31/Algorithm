package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(func(list,tmp)) {
				sb.append("1"+"\n");
			}else {
				sb.append("0"+"\n");
			}
		}
		System.out.println(sb);
	}
	private static boolean func(int[] list, int tmp) {
		int start = 0;
		int end = list.length-1;
		while(start<=end) {
			int min = (start+end)/2;
			if(list[min] == tmp) return true;
			if(list[min] < tmp) {
				start = min+1;
			}else if(list[min] > tmp) {
				end = min-1;
			}
		}
		return false;
	}
}
