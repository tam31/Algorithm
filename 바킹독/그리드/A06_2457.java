package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A06_2457 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			arr[i][0] = a*100+b;
			arr[i][1] = c*100+d;
		}
		
		int start = 301;
		int ans = 0;
		while(start <1201) {
			int end = start;
			for(int i=0; i<n; i++) {
				if(arr[i][0]<=start && arr[i][1] > end) {
					end = arr[i][1];
				}
			}
			if(end==start) {
				System.out.println(0);
				return;
			}
			
			ans +=1;
			start = end;
		}
		System.out.println(ans);
	}

}
