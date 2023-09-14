package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//5가 크기때문에 5를 먼저 나눠지는지 확인한다.
		//5로 나누어지지 않을경우 -3을 해준다
		//n이 음수가 되면 없는 수이다
		int cnt = 0;
		while(n>0) {
			if(n%5==0) {
				cnt += n/5;
				n =0;
			}else {
				cnt +=1;
				n -=3;
			}
			
			if(n<0) {
				cnt = -1;
			}
		}
		
		System.out.println(cnt);

	}

}
