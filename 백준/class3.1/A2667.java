package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2667 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		int cnt = 0;
		List<Integer> list = new ArrayList<>();
		Queue<int[]> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1) {
					cnt +=1;
					map[i][j] = -1;
					que.add(new int[] {i,j});
					int sum = 1;
					
					while(!que.isEmpty()) {
						int[] data = que.poll();
						for(int k=0; k<4; k++) {
							int nx = dx[k]+data[0];
							int ny = dy[k]+data[1];
							
							if(nx>=0&&nx<n&&ny>=0&&ny<n&&map[nx][ny]==1) {
								que.add(new int[] {nx,ny});
								map[nx][ny] = -1;
								sum +=1;
							}
						}
					}
					list.add(sum);
				}
			}
		}
		Collections.sort(list);
		System.out.println(cnt);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
