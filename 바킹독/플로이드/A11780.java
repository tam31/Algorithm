package 플로이드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A11780 {
	
	static int INF = 987654321;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] map = new int[n][n];
		int[][] route = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j) {
					map[i][j] = INF;
					route[i][j] = INF;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(map[a-1][b-1] > c ) {
				map[a-1][b-1] = c;
				route[a-1][b-1]=b;
			}
			
		}
		
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(map[i][j] > (map[i][k]+map[k][j])) {
						map[i][j] = map[i][k]+map[k][j];
						route[i][j] = route[i][k];
					}
				}
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==INF) {
					System.out.print(0+" ");
				}else {
					System.out.print(map[i][j]+" ");
				}
				
			}
			System.out.println();
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(route[i][j] == INF ||route[i][j] == 0) {
					System.out.println(0);
				}else {
					int cnt = 1;
					int now = route[i][j];
					List<Integer> list = new ArrayList<>();
					list.add(i+1);
					while(now != 0) {
						list.add(now);
						cnt +=1;
						now = route[now-1][j];
					}
					System.out.print(cnt+" ");
					for(int k: list) {
						System.out.print(k+" ");
					}
					System.out.println();
				}
			}
		}
	}

}