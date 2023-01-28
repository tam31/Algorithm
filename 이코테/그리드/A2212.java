package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2212 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		//배열넣기
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열정렬
		Arrays.sort(arr);
		
		//각 센서간에 간격 차이값
		int[] s = new int[n-1];
		for(int i=0; i<n-1; i++) {
			s[i] = Math.abs(arr[i]-arr[i+1]);
		}
		
		//센서간의 차이값 정렬
		Arrays.sort(s);
		
		int add = 0;
		for(int i=0; i<n-m; i++) {
			add += s[i];
		}
		
		System.out.println(add);
		
	}

}
