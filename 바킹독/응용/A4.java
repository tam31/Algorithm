package 응용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		//배열넣기
		char[] arr = new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		//스택에 넣기
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			//'('의 경우 스택에 저장
			if(str.charAt(i) == '(') {
				stack.add('(');
			}else if(str.charAt(i) == ')') {
				stack.pop();
				//i-1이 '('이면 레이저 이므로 사이즈만큼 더하기
				if(arr[i-1] == '(') {
					cnt += stack.size();
				}else {
					//i-1 ')'라면 막대기가 끝임으로 하나만 더하기
					cnt +=1;
				}
			}
		}
		System.out.println(cnt);
	}

}
