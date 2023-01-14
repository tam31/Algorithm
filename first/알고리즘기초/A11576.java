package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A11576 {

	public static void main(String[] args) throws IOException {
		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		//미래의 수 10진수로 합치기
		int sum = 0;
		for(int i = 0; i<m ; i++) {
			int n = Integer.parseInt(st.nextToken());
			sum += n*(Math.pow(a, m-1-i));
		}
		
		//10진수 b로 바꾸기
		Stack stack = new Stack<>();
		while(sum !=0) {
			stack.push(sum%b);
			sum /=b;
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		System.out.println(sb);
	}

}
