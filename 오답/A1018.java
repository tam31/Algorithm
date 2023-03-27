package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] arr = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='W') {
					arr[i][j] = true;
				}
			}
		}
		
		int maxCnt = 64;
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				int cnt = 0;
				
				
				boolean a = arr[i][j];
				for(int x=i; x<i+8; x++) {
					for(int y = j; y<j+8; y++) {
						
						if(a != arr[x][y]) {
							cnt +=1;
						}
						
						a = !a;
					}
					a = !a;
				}
				cnt = Math.min(cnt, 64-cnt);
				maxCnt = Math.min(maxCnt, cnt);
			}
		}
		
		
		
		System.out.println(maxCnt);
	}

}
