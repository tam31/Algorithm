package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A14938 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int[] data = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		int[][] map = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i!=j) {
					map[i][j] = 987654321;
				}
			}
		}
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(c<=m) {
				map[a][b] = c;
				map[b][a] = c;
			}
			
		}
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j]> map[i][k]+map[k][j] && map[i][k]+map[k][j] <=m) {
						map[i][j] = map[i][k]+map[k][j];
					}
				}
			}
		}
		
//		System.out.println(Arrays.deepToString(map));
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			int sum = data[i];
			for(int j=1; j<=n; j++) {
				if(map[i][j] != 0 && map[i][j] !=987654321) {
					sum += data[j];
				}
			}
//			System.out.println(sum);
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}

}
