package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A2812 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		
		//스택으로 넣기
		int cnt = 0;
		Stack stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(stack.isEmpty()) {
				stack.add(str.charAt(i));//비어 있다면 스택에 넣어준다.
			}else {
				//스택의 최상 값이 비교 값보다 작으면 뺴준다

				while(!stack.isEmpty() &&(char)stack.peek() < str.charAt(i) && cnt < m) {
					stack.pop();
					cnt +=1;
				}
				stack.add(str.charAt(i));
			}
		}
		
		//출력
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n-m; i++) {
			sb.append(stack.get(i));
		}
		
		System.out.println(sb);
		
	}

}
