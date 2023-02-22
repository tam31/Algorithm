package 정렬2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A09_7795 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int num=0; num<n; num++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int[] arr1 = new int[a];
			int[] arr2 = new int[b];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<a; i++) {
				arr1[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<b; i++) {
				arr2[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			int cnt=0;
			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					if(arr1[i] <= arr2[j]) {
						break;
					}
					cnt +=1;
				}
			}
			System.out.println(cnt);
		}
		
		
	}

}
