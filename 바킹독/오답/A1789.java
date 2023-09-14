package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1789 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		//1부터 n까지의 더합값이 n이 될때까지가 매순간 최적의 경우
		//19까지가 190이지만 19 숫자가 아닌 19보다 큰 다른 숫자를 선택할경우 200이 가능
		long sum = 0;
		long ans = 1; //갯수가 자기 자신일경우도 잇기 때문
		for(long i =1; i<=n; i++) {
			sum += i;
			if(sum > n) {
				ans = i-1;
				break;
			}
		}
		System.out.println(ans);
	}

}
