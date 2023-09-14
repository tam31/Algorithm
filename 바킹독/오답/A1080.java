package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1080 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//배열넣기
		char[][] a = new char[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				a[i][j] = str.charAt(j);
			}
		}
		
		char[][] b = new char[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				b[i][j] = str.charAt(j);
			}
		}
		
		//배열 비교
		int cnt = 0;
		for(int i=0; i<=n-3; i++) {
			for(int j=0; j<=m-3; j++) {
				if(a[i][j] != b[i][j]) {
					cnt +=1;
					for(int x=i; x<i+3; x++) {
						for(int y=j; y<j+3; y++) {
							a[x][y] = (a[x][y] =='0') ? '1':'0';
							
						}
					}
				}
			}
		}
		
		
//		System.out.println(Arrays.deepToString(a));
		//같은지 확인
		boolean check = true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] != b[i][j]) {
					check = false;
				}
			}
		}
		if(check) {
			System.out.println(cnt);
		}else {
			System.out.println(-1);
		}
	
	}

}
