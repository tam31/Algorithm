package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1074 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int a = (int)Math.pow(2, n);
		func(a,m,k);
	}
	static void func(int a, int x, int b) {
		if(a==1) {
			System.out.println(cnt);
			return;
		}
		a /=2;
		if(x<a&&b<a) {
			func(a, x,b);
		}else if(x<a && b<a+a) {
			cnt += a*a;
			func(a, x, b-a);
		}else if(x<a+a && b<a) {
			cnt += a*a*2;
			func(a, x-a,b);
		}else {
			cnt += a*a*3;
			func(a, x-a,b-a);
		}
		
	}
}
