package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A3109 {
	static char[][] map;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//배열넣기
		map = new char[n][m];
		
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		//파이프 만들기
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(check(i,0)) {
				cnt +=1;
			}
		}
		
		System.out.println(cnt);
	}

	private static boolean check(int i, int j) {
		map[i][j] = '-';
		
		if(j==m-1) {
			return true;
		}
		
		if(i>0 && map[i-1][j+1] == '.') {
			if(check(i-1, j+1)) {
				return true;
			}
		}
		
		if(map[i][j+1]=='.') {
			if(check(i,j+1)) {
				return true;
			}
		}
		
		if(i+1<n && map[i+1][j+1]=='.') {
			if(check(i+1,j+1)) {
				return true;
			}
		}
		
		return false;
	}
	
}
