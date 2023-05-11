package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11279 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) {
				if(q.isEmpty()) {
					sb.append(0+"\n");
				}else {
					sb.append(q.poll()+"\n");
				}
			}else {
				q.add(a);
			}
		}
	}

}
