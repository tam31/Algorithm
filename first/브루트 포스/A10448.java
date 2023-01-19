package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10448 {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		//1000이하의 삼각수
		arr = new int[45];
		for(int i=1; i<45; i++) {
			arr[i] = (i*(i+1))/2;
		}
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(check(num)) {
				sb.append(1+"\n");
			}else {
				sb.append(0+"\n");
			}
			
		}
		System.out.println(sb);

	}
	public static boolean check(int num) {
		for(int a=1; a<45; a++) {
			for(int b=1; b<45; b++) {
				for(int c=1; c<45; c++) {
					if(arr[a]+arr[b]+arr[c] == num) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
