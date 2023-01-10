package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A14002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		int[] arr = new int[n];
		
		//입력받기
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		
		//가장 긴 증가하는 부분,최댓값
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			max = Math.max(max, dp[i]);
		}
		
		sb.append(max+"\n");
		//증가하는 부분 뽑기
		Stack stack = new Stack<>();
		for(int i=n-1; i>=0; i--) {
			if(max==dp[i]) {
				max -=1;
				stack.push(arr[i]);
			}
		}
		
		//출력
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		System.out.println(sb);

	}

}
