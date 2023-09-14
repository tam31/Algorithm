package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1049 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//n,m구하기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//패키지와 낱개의 최솟값 구하기
		
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st.nextToken());
			int b1 = Integer.parseInt(st.nextToken());
			a = Math.min(a, a1);
			b = Math.min(b, b1);
		}
		
		//1.n를 패키지로 살때, 낱개로 다 살때
		//2. 패기지와 낱개로 n개를 살때
		int sum = Integer.MAX_VALUE;
		sum = Math.min(((n/6)+1)*a, n*b);
		sum = Math.min(sum, (n/6)*a+(n%6)*b);
		
		System.out.println(sum);
	}

}
