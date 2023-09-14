package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
		
		//배열정렬
		Arrays.sort(arr);
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans = Math.max(ans, arr[n-1-i]*(i+1));
		}
		System.out.println(ans);
	}

}
