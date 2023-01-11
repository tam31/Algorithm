package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A9613 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			
			//갯수 입력받기
			int num = Integer.parseInt(st.nextToken());
			int[] arr = new int[num];
			for(int j =0; j<num; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			//최소 공배수 합구하기
			long cnt = 0; //n(n-1)//2 * 1000000 int 값을 벗어남!
			for(int j=0; j<num-1; j++) {
				for(int k=j+1; k<num; k++) {
					cnt+=GCD(arr[j], arr[k]);
				}
			}
			
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
	//최소 공배수 구하기
	static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		return GCD(b, a%b);
	}
}