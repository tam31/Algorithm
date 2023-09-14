package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1080 {
	static char[][] arr;
	static char[][] check;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m];
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		check = new char[n][m];
		for(int i=0; i<n; i++) {
			check[i]= br.readLine().toCharArray();
		}
		
		int cnt = 0;
		for(int i=0; i<=n-3; i++) {
			for(int j=0; j<=m-3; j++) {
				if(arr[i][j] != check[i][j]) {
					cnt +=1;
					for(int x=0; x<3; x++) {
						for(int y=0; y<3; y++) {
							arr[i+x][j+y] = (arr[i+x][j+y] == '0') ? '1':'0';
							
						}
					}
				}
			}
		}
		if(ok()) {
			System.out.println(cnt);
		}else {
			System.out.println(-1);
		}
		
	}
	public static boolean ok() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] != check[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
