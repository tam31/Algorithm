package 이분탐색.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2473 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] list = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(list);
		
		long min = Long.MAX_VALUE;
		long[] ans = new long[3];
		for(int i=0; i<n-1; i++) {
			int start = i+1;
			int end = n-1;
			while(start<end) {
				long sum = list[i]+list[start]+list[end];
				
				if(Math.abs(min)>Math.abs(sum)) {
					min = sum;
					ans[0] = list[i];
					ans[1] = list[start];
					ans[2] = list[end];
				}
				
				if(sum>0) {
					end -=1;
				}else {
					start +=1;
				}
			}
		}
		
		System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
	}

}
