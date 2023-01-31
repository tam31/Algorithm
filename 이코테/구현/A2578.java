package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2578 {
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		//빙고판 만들기
		arr = new int[5][5];
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//사회자가 부르는 숫자
		//카운터
		int cnt = 0;
		boolean ans = false;
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				int num = Integer.parseInt(st.nextToken());
//				System.out.println(num);
				check(num); //빙고표시하기
				cnt +=1;
				ans = check2();
				if(ans) {
					break;
				}
			}
			if(ans) {
				break;
			}
		}
		System.out.println(cnt);
//		System.out.println(Arrays.deepToString(arr));
	}
	//빙고표시하기
	private static void check(int num) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(num == arr[i][j]) {
					arr[i][j] = 0;
				}
			}
		}
	}
	
	private static boolean check2() {
		int cnt = 0;
		//대각선
		boolean ans = true;
		for(int i=0; i<5; i++) {
			if(arr[i][i] != 0) {
				ans = false;
				break;
			}
		}
		if(ans) cnt +=1;
		
		ans = true;
		for(int i=0; i<5; i++) {
			if(arr[4-i][i] != 0) {
				ans = false;
				break;
			}
		}
		if(ans) cnt +=1;
		
		//가로
		for(int i=0; i<5; i++) {
			ans = true;
			for(int j=0; j<5; j++) {
				if(arr[i][j] != 0) {
					ans = false;
					break;
				}
			}
			if(ans) cnt +=1;
			
			ans =true;
			for(int j =0; j<5; j++) {
				if(arr[j][i] !=0) {
					ans=false;
					break;
				}
			}
			if(ans) cnt +=1;
		}
		if(cnt >=3) {
			return true;
		}else {
			return false;
		}
	
	}
	

}
