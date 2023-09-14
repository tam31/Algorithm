package 오답;

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
		int k = Integer.parseInt(br.readLine());
		
		//배열넣기
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열정렬하기 최소값을 구하기위해
		Arrays.sort(arr);
		
		//센서간의 차이 구하기
		int[] a = new int[n-1];
		for(int i=0; i<n-1; i++) {
			a[i] = Math.abs(arr[i]-arr[i+1]);
		}
		
		//센서간의 차이를 정렬
		Arrays.sort(a);
		//집합이기 때문에 n-k만큼 간격을 가질수 잇음
		int sum = 0;
		for(int i=0; i<n-k; i++) {
			sum += a[i];
		}
		
		//출력
		System.out.println(sum);
	}

}
