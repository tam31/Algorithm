package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//2와 5가 나오는 횟수
		int cnt1 = 0; int cnt2 = 0;
		
		for(int i=1; i<=n; i++) {
			int num = i;
			while(num % 2 == 0) {
				cnt1 +=1;
				num /=2;
			}
			while(num % 5 == 0) {
				cnt2 +=1;
				num/=5;
			}
		}
		//2와 5중 제일 작은 만큼 10이 생성됌
		System.out.println(Math.min(cnt1, cnt2));

	}

}
