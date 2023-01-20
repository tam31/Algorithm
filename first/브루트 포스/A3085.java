package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A3085 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] arr = new char[n][n];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		int max = 0;
		//다른 색끼리 바꾸기
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				//가로
				if(arr[i][j] != arr[i][j+1]) {
					char tmp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = tmp;
					
					max = Math.max(max,check(arr, max, n));
//					System.out.println(Arrays.deepToString(arr));
					//원 위치로
					arr[i][j+1] = arr[i][j];
					arr[i][j] = tmp;
				}
				//세로
				if(arr[j][i] != arr[j+1][i]) {
					char tmp = arr[j][i];
					arr[j][i] = arr[j+1][i];
					arr[j+1][i] = tmp;
					
					max = Math.max(max,check(arr, max, n));
//					System.out.println(Arrays.deepToString(arr));
					//원 위치로
					arr[j+1][i] = arr[j][i];
					arr[j][i] = tmp;
					
				}
			}
		}
		
		System.out.println(max);
//		System.out.println(Arrays.toString(arr[0]));
		
	}

	public static int check(char[][] arr, int max, int n) {
		for(int i=0; i<n; i++) {
			//가로
			int cnt1=1;
			for(int j=0; j<n-1; j++) {
				if(arr[i][j] == arr[i][j+1]) {
					cnt1+=1;
				}else {
					cnt1 = 1;
				}
				max = Math.max(max, cnt1);
			}
			//세로
			int cnt2=1;
			for(int j=0; j<n-1; j++) {
				if(arr[j][i] == arr[j+1][i]) {
					cnt2+=1;
				}else {
					cnt2=1;
				}
				max = Math.max(max, cnt2);
			}
		}
		return max;
	}
	
}
