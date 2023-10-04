package leve3;
import java.util.*;
public class A순위 {

	public static void main(String[] args) {
		int n = 5;
		int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};;
		
		int[][] map = new int[n+1][n+1];
		for(int i=0; i<results.length; i++) {
			int x = results[i][0];
			int y = results[i][1];
			
			map[x][y] = 1;
			map[y][x] = -1;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][k]==1 && map[k][j]==1) {
						map[i][j] = 1;
						map[j][i] = -1;
					}
				}
			}
		}
		
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			int count = 0;
			for(int j=1; j<=n; j++) {
				if(map[i][j] !=0) {
					count +=1;
				}
			}
			if(count ==n-1) {
				ans +=1;
			}
		}
		System.out.println(ans);
	}

}
