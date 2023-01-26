package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class A1715 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//우선순위 큐로 넣음
		PriorityQueue que = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			que.add(Integer.parseInt(br.readLine()));
		}
		int sum = 0;
		//번호가 낮은 순으로 더하여 계산
		while(que.size() != 1) {
			int a =(int)que.poll();
			int b =(int)que.poll();
			sum += (a+b);
			que.add((a+b));
		}
		System.out.println(sum);
	}

}
