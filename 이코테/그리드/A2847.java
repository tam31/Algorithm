package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2847 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//배열안에 넣기
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//최대 점수 값은 arr[n-1]값
		//최대 점수에서 -1이 최소로 감소시키는 값
		int max = arr[n-1];
		int cnt = 0;
		for(int i= n-2; i>=0; i--) {
			if(arr[i] >= max) {
				cnt += arr[i]-max+1;
				arr[i] = max-1;
			}
			max = arr[i];
		}
		System.out.println(cnt);
		
	}

}
