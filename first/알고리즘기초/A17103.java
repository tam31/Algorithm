package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A17103 {
	public static final int MOD = 1000001;
	public static boolean[] arr;
	public static void main(String[] args) throws IOException {
		//소수구하기
		arr = new boolean[MOD];
		arr[0] = true; arr[1] = true;
		for(int i=2; i<Math.sqrt(MOD); i++) {
			if(arr[i]) continue;
			for(int j=i*i; j<MOD; j+=i) {
				arr[j] = true;
			}
		}
		
		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			int cnt = 0;
			for(int k = 2; k<=num/2; k++) { //반복되기때문에 반으로 나눔
				if(!arr[k] && !arr[num-k]) {
					cnt +=1;
				}
			}
			sb.append(cnt+"\n");
		}
		//출력
		System.out.println(sb);
	}

}
