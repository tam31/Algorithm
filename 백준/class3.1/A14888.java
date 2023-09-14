package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14888 {
	static int n;
	static int[] arr;
	static int[] data;
	static long min = Integer.MAX_VALUE;
	static long max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		data = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		func(arr[0],1);
		StringBuilder sb = new StringBuilder();
		sb.append(max+"\n");
		sb.append(min);
		System.out.println(sb);
	}
	private static void func(long sum, int cnt) {
		if(cnt == n) {
			max = Math.max(sum, max);
			min = Math.min(sum, min);
			return;
		}
		long a = sum;
		for(int i=0; i<4; i++) {
			if(data[i] ==0) continue;
			
			if(i==0) {
				sum += arr[cnt];
			}else if(i==1) {
				sum-=arr[cnt];
			}else if(i==2) {
				sum *= arr[cnt];
			}else {
				sum /= arr[cnt];
			}
			cnt +=1;
			data[i] -= 1;
			func(sum,cnt);
			data[i] +=1;
			cnt -=1;
			sum = a;
		}
		
	}

}
