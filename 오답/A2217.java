package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//매순간 최적의 경우를 구한다.
public class A2217 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//배열넣기
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//매순간 최적의 경우리 구한다.
		//정렬을 한다음 큰쪽부터 구할경우 최적의 경우
		int sum = 0;
		for(int i=n-1; i>=0; i--) {
			sum=Math.max(sum, arr[i]*(n-i));
		}
		
		//출력
		System.out.println(sum);
	}

}
