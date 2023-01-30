package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1966 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nums = Integer.parseInt(br.readLine());
		for(int num = 0; num<nums; num++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			//큐로 받음
			Queue<Integer> que = new LinkedList<>();
			Queue<Integer> idx = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				que.add(Integer.parseInt(st.nextToken()));
				idx.add(i);
			}
			
			int cnt = 1;
			while(true) {
				int max = Collections.max(que);
				int check = que.poll();
				int checkIdx = idx.poll();
				
				if(check != max) {
					que.add(check);
					idx.add(checkIdx);
				}
				
				
				if(check == max) {
					if(checkIdx == k) {
						break;
					}
					cnt+=1;
				}
				
			}
			
			System.out.println(cnt);
		}
	}

}
