package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A11000 {

	
	public static void main(String[] args) throws IOException{
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//2차원 배열로 받는다 int[n][2]
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순으로 배열정렬(시작 시간이 같다면, 끝나는 시간으로 오름차순)
		Arrays.sort(arr, (o1,o2) ->{
			if(o1[0] == o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		//회의실(방이 1개)일때는 필요없지만 최소 방의 갯수를 구함.
		//우선순위 큐를 만들어 끝나는 시간순으로 우선순위로 넣어준다.
		//우선순위 큐안에 가장 빨리 끝나는 시간과 배열안의 시작시간을 비교하면 빼준다.
		PriorityQueue que = new PriorityQueue<>();
		que.add(arr[0][1]);
		
		for(int i=1; i<n; i++) {
			if((int)que.peek()<=arr[i][0]) {
				que.poll();
			}
			que.add(arr[i][1]);
		}
		System.out.println(que.size());
	}

}
