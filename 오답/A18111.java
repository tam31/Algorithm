package 오답;

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
		//땅의 최대값, 최소값 찾기
		int max = 0;
		int min = 256;
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(arr[i][j], max);
				min = Math.min(min, arr[i][j]);
			}
		}
		
		//땅의 크기가 최소에서 최대일때
		//최소시간과 높이가 가장 높을때 구하기
		int time = Integer.MAX_VALUE;
		int high = 0;
		
		for(int i=min; i<=max; i++) {
			int block = k;
			int add = 0;
			for(int x=0; x<n; x++) {
				for(int y=0; y<m; y++) {
					//땅이 특정땅보다 클때
					if(arr[x][y] > i) {
						//땅을 판다
						add += 2*(arr[x][y]-i);
						block += 1;
					}else if(arr[x][y] <i){
						//땅을 쌓는다.
						block -=1;
						add += (i-arr[x][y]);
					}
				}
			}
			//블록이 음수가 되면
			//해당 땅이 점점 커짐으로
			//다음 값도 음수가 되서 break
			if(block <0) {
				break;
			}
			
			if(time>add) {
				time = add;
				high = i;
			}
		}
		
		System.out.println(time+" "+high);
	}

}
