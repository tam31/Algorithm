package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A15903 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//배열넣기
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//m번 만큼 배열정렬 후 최솟값 두개를 뽑아 더 한다
		//더한 값을 다시 넣는다.
		for(int i=0; i<m; i++) {
			Arrays.sort(arr);
			int sum = arr[0]+arr[1];
			arr[0] = sum;
			arr[1] = sum;
			
		}
		//값들을 더하기
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += arr[i];
		}
		
		//출력
		System.out.println(ans);
		
	
	}

}
