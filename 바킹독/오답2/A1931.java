package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1931 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//배열만들기
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//끝나는 순으로 정렬
		//끝나는 시간이 같다면 시작시간으로 정렬
		Arrays.sort(arr, (o1,o2)->{
			if(o1[1] == o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1];
		});
		
		//끝나는 시간이 시작시간보다 작거나 같을때
		int end=0;
		int cnt=0;
		for(int[] k: arr) {
			if(end <= k[0]) {
				end = k[1];
				cnt +=1;
			}
		}
		
		System.out.println(cnt);
	}

}
