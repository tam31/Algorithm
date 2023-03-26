package 완전탐색;

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
		
		boolean[][] map = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				if(str.charAt(j)=='W') {
					map[i][j] = true;
				}else {
					map[i][j] = false;
				}
			}
		}
		
		
		
		int cnt = Integer.MAX_VALUE;
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				
				int count = 0;
				boolean a = map[i][j];
				for(int x = i; x<i+8; x++) {
					for(int y = j; y<j+8; y++) {
						
						if(map[x][y] != a) {
							count +=1;
						}
						
						a = !a;
						
					}
					a = !a;
				}
				count = Math.min(count, 64-count);
				
				cnt = Math.min(cnt, count);
				
			}
		}
		System.out.println(cnt);
	}

}
