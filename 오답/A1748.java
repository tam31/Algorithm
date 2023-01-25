package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sum=0;
		int check = 10;
		int cnt = 1;
		for(int i=1; i<=n; i++) {
			if(i%check==0) {
				check *=10;
				cnt +=1;
			}
			sum +=cnt;
		}
		System.out.println(sum);
	}

}
