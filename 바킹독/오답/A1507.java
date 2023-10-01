package 플로이드.오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1507 {
	static int[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		if(func(n)) {
			int sum = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(map[i][j] != 0) {
						sum += map[i][j];
						map[i][j] = 0;
						map[j][i] = 0;
					}
				}
			}
			System.out.println(sum);
		}else {
			System.out.println(-1);
		}
		
	}
	private static boolean func(int n) {
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(map[i][j]==0 || map[i][k]==0 || map[k][j]==0) continue;
					
					if(map[i][j] > map[i][k]+map[k][j]) {
						return false;
					}
					if(map[i][j] == map[i][k]+map[k][j]) {
						map[i][j] = 0;
					}
				}
			}
		}
		
		return true;
	}

}
