package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int pack = 1000;
		int one = 1000;
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			pack = Math.min(pack, Integer.parseInt(st.nextToken()));
			one = Math.min(one, Integer.parseInt(st.nextToken()));
		}
		
		int ans = Math.min(((int)Math.ceil((double)n/6))*pack, n*one);
		ans = Math.min((n/6)*pack+ (n%6)*one, ans);
		System.out.println(ans);
	}

}
