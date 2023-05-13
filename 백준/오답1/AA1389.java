package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class AA1389 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		for(int i=0; i<=n; i++) {
			Arrays.fill(arr[i], 987654321);
			arr[i][i] = 0;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b]=1;
			arr[b][a]=1;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k]+arr[k][j]);
				}
			}
		}
		
		int cnt = Integer.MAX_VALUE;
		int idx = 0;
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=1; j<=n; j++) {
				sum += arr[i][j];
			}
			if(sum < cnt) {
				cnt = sum;
				idx = i;
			}
		}
		
		System.out.println(idx);
	}

}
