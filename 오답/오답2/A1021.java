package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A1021 {
	static int n;
	static LinkedList<Integer> deque;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		deque = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			deque.add(i);
		}
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(check(num)) {
				while(deque.get(0) != num) {
					deque.addLast(deque.pollFirst());
					cnt +=1;
				}
			}else {
				while(deque.get(0) !=num) {
					deque.addFirst(deque.pollLast());
					cnt +=1;
				}
			}
			deque.poll();
		}
		
		System.out.println(cnt);
	}

	private static boolean check(int num) {
		for(int i=0; i<=deque.size()/2; i++) {
			if(deque.get(i) == num) {
				return true;
			}
		}
		return false;
	}

}
