package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A13164 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		//배열넣기
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		//배열정렬하기
		Arrays.sort(arr);
		
		//키차이순으로 배열 만들기
		int[] a = new int[n-1];
		for(int i=0; i<n-1; i++) {
			a[i] = Math.abs(arr[i]-arr[i+1]);
		}
		
		//키 작은순으로 정렬하기
		Arrays.sort(a);
		
		//마지막 차이는 
		/*
		 * 6개중 1번 합치면 n-1 5개가 된다.
		 * 6개중 2번 합치면 n-2 4개가 된다.
		 * 6개중 3번 합치면 n-3 3개가 된다.
		 * =>n중 k번 합치면 집합으로 n-k개가 된다.
		 */
		int add = 0;
		for(int i=0; i<n-k; i++) {
			add += a[i];
		}
		
		System.out.println(add);
	}

}
