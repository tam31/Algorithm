package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A18310 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//배열넣기
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열정렬
		Arrays.sort(arr);
		
		//중간값 구하기
		System.out.println(arr[(n-1)/2]);
//		if(arr.length % 2 !=0) {
//			int sum = 0;
//			int target = arr[arr.length/2];
//			for(int i=0; i<n; i++) {
//				sum += Math.abs(arr[i] - target);
//			}
//			System.out.println(target);
//		}else {
//			int sum1 = 0;
//			int target1 = arr[arr.length/2];
//			for(int i=0; i<n; i++) {
//				sum1 += Math.abs(arr[i]-target1);
//			}
//			int sum2=0;
//			int target2 = arr[arr.length/2-1];
//			for(int i=0; i<n; i++) {
//				sum2 += Math.abs(arr[i]-target2);
//			}
//			if(sum1>=sum2) {
//				System.out.println(target2);
//			}else {
//				System.out.println(target1);
//			}
//		}
		
	}

}
