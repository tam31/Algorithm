package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1449 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		//배열넣기
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열정렬
		Arrays.sort(arr);
		
		//
		int cnt = 0;
		int check = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] >= check) {
				check = arr[i]+l;
				cnt +=1;
			}
			
		}
		System.out.println(cnt);
	}

}
