package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2089 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		if(n == 0) {
			System.out.println(0);
		}else {
			while(n != 0) {
				if(n % 2 != 0) {
					sb.append(1);
					n = (int)Math.ceil((double)n/-2);//int로만 계산해서 소수점이 없어 올림이 안됌
				}else {
					sb.append(0);
					n = n/-2;
				}
			}
			System.out.println(sb.reverse());
		}
		
	}

}
