package 그리드;

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
		
		//배열 입력받기
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				a[i][j] = str.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				b[i][j] = str.charAt(j)-'0';
			}
		}
		
//		System.out.println(Arrays.deepToString(b));
		
		//최대 3x3임으로 여기서 맞지 않으면 안에 잇는것을 변경
		int cnt = 0;
		for(int i=0; i<=n-3; i++) {
			for(int j=0; j<=m-3; j++) {
				if(a[i][j] != b[i][j]) {
					cnt +=1;
					for(int x=i; x<i+3; x++) {
						for(int y=j; y<j+3; y++) {
							a[x][y] = (a[x][y] ==0) ? 1:0;
						}
					}
				}
			}
		}
//		System.out.println(Arrays.deepToString(a));
//		System.out.println(cnt);
		//같은지 확인
		boolean check = true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] != b[i][j]) {
					check = false;
					break;
				}
			}
		}
		if(!check) {
			System.out.println(-1);
		}else {
			System.out.println(cnt);
		}
		
	}

}
