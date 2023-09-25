package 플로이드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A21940 {
	static final int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n+1][n+1];
		for(int i=0; i<=n;i++) {
			Arrays.fill(map[i], 987654321);
			map[i][i]=0;
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			map[a][b] = c;
		}
		
		int z = Integer.parseInt(br.readLine());
		int[] f = new int[z];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<z; i++) {
			f[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
				}
			}
		}
		
		List<int[]> list = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			int max = 0;
			for(int j=0; j<z; j++) {
				max = Math.max(max, map[i][f[j]]+map[f[j]][i]);
			}
			list.add(new int[] {max,i});
		}
		
		Collections.sort(list, (o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		int tmp = list.get(0)[0];
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)[0]==tmp) {
				System.out.printf("%d ", list.get(i)[1]);
			}
		}
	}

}