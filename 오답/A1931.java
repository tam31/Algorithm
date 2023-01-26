package 오답;

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
		//배열 넣기
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//배열 끝나는 시간이 빠른 순으로 정렬하기
		//같으면 시작시간이 빠른 순
		Arrays.sort(arr,(o1, o2)->{
			if(o1[1] == o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1];
		});
			
		int cnt = 0;
		int endTime=0;
		//시작시간이 그전 회의의 끝날 시간보다 뒤에 있을떄
		for(int[] k:arr) {
			if(endTime <= k[0]) {
				endTime = k[1];
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}

}
