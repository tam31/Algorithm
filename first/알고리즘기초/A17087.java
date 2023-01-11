package 알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A17087 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		str = br.readLine();
		st = new StringTokenizer(str," ");
		for(int i = 0; i<n ;i++) {
			arr[i] = Math.abs(s-Integer.parseInt(st.nextToken()));
		}
		
		//최대공약수 구하기
		int ans = arr[0];
		for(int i=1; i<n; i++) {
			ans = GCD(ans,arr[i]);
		}
		System.out.println(ans);
	}
	//최대공약수
	public static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		return GCD(b, a%b);
	}
}
