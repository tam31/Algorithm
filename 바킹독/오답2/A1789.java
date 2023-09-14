package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1789 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		//매순간 최적의 경우를 구한다.
		//1부터 더해서 n를 넘는 순간 멈춘다
		long sum = 0;
		long ans = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
			if(sum>n) {
				ans = i-1;
				break;
			}else if(sum == n) {
				ans = i;
				break;
			}
		}
		//최적의 해는 합이 n과 같거나 클때의 i번쨰의 -1이다
		System.out.println(ans);
		
	}

}
