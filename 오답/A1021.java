package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A1021 {
	static LinkedList<Integer> deque;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		deque = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			deque.add(i);
		}
		
		int cnt=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(st.nextToken());

			if(check(num)) {
				while(num != deque.get(0)){
					cnt +=1;
					deque.addLast(deque.pollFirst());
				}
				
			}else {
				while(num != deque.get(0)) {
					cnt +=1;
					deque.addFirst(deque.pollLast());
				}
					
			deque.poll();	
			}
		}
		System.out.println(cnt);
	}

	private static boolean check(int a) {

		for(int i=0; i<=n/2; i++) {
			if(a == deque.get(i)) {
				return true;
			}
		}
		return false;
	}

}
