package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2467 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] list = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Long.parseLong(st.nextToken());
		}
		
		long min = Integer.MAX_VALUE;
		int start = 0;
		int end = n-1;
		long ans[] = new long[2];
		while(start<end) {
			long sum = list[start] +list[end];
//			System.out.println(sum);
			if(min > Math.abs(sum)) {
				min = Math.abs(sum);
				ans[0] = list[start];
				ans[1] = list[end];
			}
			
			if(sum ==0) break;
			if(sum>0) {
				end -=1;
			}else {
				start +=1;
			}
		}
		System.out.println(ans[0]+" "+ans[1]);
	}

}
