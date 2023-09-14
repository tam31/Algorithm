package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1759 {
	static int n;
	static int m;
	static char[] arr;
	static char[] ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new char[n];
		ans = new char[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(arr);
		
		func(0,0);
		System.out.println(sb);
	}
	private static void func(int k, int z) {
		if(k == m) {
			int cnt1 = 0;
			int cnt2 = 0;
			
			for(int i=0; i<m; i++) {
				if(check(ans[i])) {
					cnt1 +=1;
				}else {
					cnt2 +=1;
				}
			}
			if(cnt1 >=1 && cnt2 >=2) {
				for(int i=0; i<m; i++) {
					sb.append(ans[i]);
				}
				sb.append("\n");
			}
			
			
			return;
		}
		for(int i=z; i<n; i++) {
			ans[k] = arr[i];
			func(k+1,i+1);
		}
	}
	private static boolean check(char a) {
		return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
	}

}
