package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A17404 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//배열 넣기
		int[][] arr = new int[n+1][3];
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[n+1][3];
		//첫 집이 3가지 색 중 1가지 일때 dp로 계산
		for(int i =0; i<3; i++) {
			//같은 수는 해당 색값을 아니면 무제한
			for(int k=0; k<3; k++) {
				if(i==k) {
					dp[1][i] = arr[1][i];
				}else {
					dp[1][k] = 1001;
				}
			}
			//문제 2번째 규칙으로 dp
			for(int j=2; j<=n; j++) {
				dp[j][0] = Math.min(dp[j-1][1], dp[j-1][2])+arr[j][0];
				dp[j][1] = Math.min(dp[j-1][0], dp[j-1][2])+arr[j][1];
				dp[j][2] = Math.min(dp[j-1][0], dp[j-1][1])+arr[j][2];
			}
			
			//3번째 규칙
			for(int j=0; j<3; j++) {
				if(i!=j) {
					ans = Math.min(ans, dp[n][j]);
				}
			}
		}
		//출력
		System.out.println(ans);
	}

}
