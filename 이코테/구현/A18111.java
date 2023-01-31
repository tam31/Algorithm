package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18111 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		//배열넣기
		//최대값, 최솟값 구하기
		int max = 0; int min = 256;
		int[][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, map[i][j]);
				min = Math.min(min, map[i][j]);
			}
		}
				
		int time = Integer.MAX_VALUE;//최소시간 구해야함
		int high = 0;// 땅의 높이가 최대인것
		
		//땅의 높이가 최소부터 최대까지 구하기(block이 되는대로 안되면 그 이상부터 안됌)
		for(int i=min; i<=max; i++) {
			int cnt=0;//시간카운터
			int block=k;//각 값마다 블록이 되는지 확인해야하기때문
			for(int x=0; x<n; x++) {
				for(int y=0; y<m; y++) {
					
					//설정값보다 해당땅보다 낮을경우
					if(i > map[x][y]) {
						cnt += (i-map[x][y]);
						block -= (i-map[x][y]);
					}
					//설정값보다 땅이 높을경우
					else {
						cnt += (map[x][y]-i)*2;
						block += (map[x][y]-i);
					}
				}
			}
			//블록이 부족하면 이상의 해당값들은 쓸수 없다.
			if(block <0) {
				break;
			}
			
			if(time > cnt) {
				time =cnt;
				high = i;
			}
		}
		
		System.out.println(time+" "+high);
	}

}
