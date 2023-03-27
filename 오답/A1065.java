package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt =0;
		for(int i=1; i<=n; i++) {
			if(i<100) {
				cnt +=1;
				continue;
			}
			int a = i/100;
			int b = (i/10)%10;
			int c = i%10;
			if((a-b) == (b-c)) {
				cnt +=1;
			}
		}
		System.out.println(cnt);
	}

}
