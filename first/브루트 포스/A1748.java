package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		int plus =1;
		int num = 10;
		for(int i=1; i<=n; i++) {
			if(i%num == 0) {
				num *=10;
				plus +=1;
			}
			count +=plus;
		}
		System.out.println(count);
	}

}
