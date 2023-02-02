package 덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push_front":
				int num = Integer.parseInt(st.nextToken());
				deque.addFirst(num);
				break;
			
			case "push_back":
				int num1 = Integer.parseInt(st.nextToken());
				deque.addLast(num1);
				break;
				
			case "pop_front":
				if(!deque.isEmpty()) {
					System.out.println(deque.pollFirst());
					break;
				}
				System.out.println(-1);
				break;
				
			case "pop_back":
				if(!deque.isEmpty()) {
					System.out.println(deque.pollLast());
					break;
				}
				System.out.println(-1);
				break;
				
			case "size":
				System.out.println(deque.size());
				break;
				
			case "empty":
				if(!deque.isEmpty()) {
					System.out.println(0);
					break;
				}
				System.out.println(1);
				break;
				
			case "front":
				if(!deque.isEmpty()) {
					System.out.println(deque.peekFirst());
					break;
				}
				System.out.println(-1);
				break;
				
			case "back":
				if(!deque.isEmpty()) {
					System.out.println(deque.peekLast());
					break;
				}
				System.out.println(-1);
				break;
			}
		}
		
	}

}
