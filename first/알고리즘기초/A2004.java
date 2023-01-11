package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//공식
		//nCr = n! / r! * (n-r)!
		//(2**a * 5**a)//(2**b * 5**b) * (2**c * 5**c)
		//(2**(a-b-c) * 5**(a-b-c))
		int cnt1 = pow(a,2) - pow(a-b,2) - pow(b,2);
		int cnt2 = pow(a,5) - pow(a-b,5) - pow(b,5);
		
		System.out.println(Math.min(cnt1, cnt2));
		

	}
	//팩토리얼이어서 1부터 a까지 값들을 곱해 누적됌
	public static int pow(int a, int b) {
		int cnt = 0;
		while(a>=b) {
			cnt += a/b;
			a /=b;
		}
		return cnt;
	}
	
}
