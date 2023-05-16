package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken())+arr[i-1];
		}
		
	
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(arr[b]-arr[a-1]+"\n");
			
		}
		System.out.println(sb);
	
	}

}
