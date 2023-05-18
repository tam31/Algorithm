package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2458 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = 1;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][k]==1 && map[k][j]==1) {
						map[i][j] = 1;
					}
				}
			}
		}
		int ans = 0;
		for(int i=1; i<=n; i++) {
			boolean a = true;
			for(int j=1; j<=n; j++) {
				if(i==j) continue;
				
				if(map[i][j] != 1 && map[j][i] !=1) {
					a =false;
					break;
				}
			}
			
			if(a) {
				ans +=1;
			}
		}
		System.out.println(ans);
	}

}
