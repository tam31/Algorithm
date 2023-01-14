package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		long max = Integer.MIN_VALUE;
		long sum = 0;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
			max = Math.max(max, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		System.out.println(max);
	}

}
