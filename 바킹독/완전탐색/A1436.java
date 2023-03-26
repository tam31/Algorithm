package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a = 666;
		int count = 1;
		while(count != n) {
			a +=1;
			if(String.valueOf(a).contains("666")) {
				count +=1;
			}
		}
		System.out.println(a);
	}

}
