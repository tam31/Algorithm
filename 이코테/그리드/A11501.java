package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11501 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		for(int num = 0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			//뒤에서부터 최대값을 비교하며
			//최대값이 더 클 경우 주식을 팜
			//최대값이 작을 경우 최대값을 바꿈
			long add =0;
			int max = arr[n-1];
			for(int i=n-2; i>=0; i--) {
				if(arr[i] < max) {
					add += max - arr[i];
				}else {
					max = arr[i];
				}
			}
			System.out.println(add);
		}
	}

}
