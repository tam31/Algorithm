package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2457 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] data = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			data[i][0] = a*100+b;
			data[i][1] = c*100+d;
		}
		
		Arrays.sort(data, (o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		
		int start = 301;
		int cnt = 0;
		while(start <1201) {
			int end = start;
			for(int i=0; i<n; i++) {
				if(start>=data[i][0] && end<=data[i][1]) {
					end = data[i][1];
				}
			}
			if(start == end) {
				System.out.println(0);
				return;
			}
			
			cnt +=1;
			start = end;
		}
		System.out.println(cnt);
	}

}
