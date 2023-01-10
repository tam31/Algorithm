package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1978 {
	public static int MOD = 1001;
	public static boolean[] arr;
	public static void main(String[] args) throws IOException {
		//소수찾기
		arr = new boolean[MOD];
		arr[1] = arr[0] = true;
		for(int i=2; i<Math.sqrt(MOD); i++) {
			if(arr[i]) continue;
			for(int j=i*i; j<MOD; j+=i) {
				arr[j] = true;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!arr[num]) cnt+=1;
		}
		
		System.out.println(cnt);
	}

}
