package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11780 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] map = new int[n+1][n+1];
		int[][] vis = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i!=j) {
					map[i][j] = 987654321;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			
			map[a][b] = Math.min(map[a][b], c);
			vis[a][b] = b;

		}
		
		
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(map[i][j]> map[i][k]+map[k][j]) {
						map[i][j] = map[i][k]+map[k][j];
						vis[i][j] = vis[i][k];
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j] == 987654321) {
					map[i][j] = 0;
				}
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				Stack<Integer> stack = new Stack<>();
				stack.add(i);
				stack.add(vis[i][j]);
				while(true) {
					int tmp = stack.peek();
					if(tmp == j || tmp ==0) {
						break;
					}
					stack.add(vis[tmp][j]);
				}
				if(i==j) {
					sb.append(0+"\n");
				}else {
					sb.append(stack.size()+" ");
					for(int k=0; k<stack.size(); k++) {
						sb.append(stack.get(k)+" ");
					}
					sb.append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}

}
