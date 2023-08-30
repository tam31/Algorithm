package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A14921 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		long ans = Integer.MAX_VALUE;
		int start =0;
		int end = n-1;
		while(start<end) {
			long tmp = list[start]+list[end];
			
			if(Math.abs(tmp) < Math.abs(ans)) {
				ans = tmp;
			}
			
			if(tmp<0) {
				start +=1;
			}else {
				end -=1;
			}
		}
		System.out.println(ans);
	}

}
