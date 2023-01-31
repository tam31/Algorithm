package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1051 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//배열만들기
		char[][] arr = new char[n][m];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			arr[i] = str.toCharArray();
		}
		//정사각형 만들수 있는 최대 크기까지
		int num = Math.min(n, m);
		
		//정사각형 만들기
		int cnt=1;
		for(int k=1; k<=num; k++) {
			//정사각형
			for(int i=0; i<n-k+1; i++) {
				for(int j=0; j<m-k+1; j++) {
//					System.out.println(k);
//					System.out.println(arr[i][j]+" "+arr[i][j+k-1]);
//					System.out.println(arr[i+k-1][j]+ " "+arr[i+k-1][j+k-1]);
//					System.out.println();
					if(arr[i][j] == arr[i][j+k-1] && arr[i+k-1][j] == arr[i+k-1][j+k-1] && arr[i][j] == arr[i+k-1][j+k-1]) {
						cnt = k*k;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
