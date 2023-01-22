package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A15990 {
	public static final int MOD = 1_000_000_009;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		//더하는 뒷자리로 2차원 배열을 만들어 구함
		long[][] dp = new long[100001][4];
		dp[1][1] = 1; dp[2][2] = 1;
		dp[3][1]=1; dp[3][2]=1; dp[3][3]=1;
		
		for(int i=4; i<=100000; i++) {
			//맨 뒷자리가 1일 나올경우 dp[i-1][2] + dp[i-1][3]
			dp[i][1] = (dp[i-1][2]+dp[i-1][3])%MOD;
			//2일 경우
			dp[i][2] = (dp[i-2][1]+dp[i-2][3])%MOD;
			//3일경우
			dp[i][3] = (dp[i-3][1]+dp[i-3][2])%MOD;
		}
		
		//답 구하기
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append((dp[num][1]+dp[num][2]+dp[num][3])%MOD+"\n");
		}
		//출력
		System.out.println(sb);
	}

}
