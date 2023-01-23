package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2839 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while(true) {
			if(n%5==0) {
				cnt += n/5;
				break;
			}
			n -= 3;
			cnt +=1;
			
			if(n<0) {
				cnt =-1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
