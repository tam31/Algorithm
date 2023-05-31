package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) {
				if(que.isEmpty()) {
					sb.append(0+"\n");
				}else {
					sb.append(que.poll()+"\n");
				}
			}else {
				que.add(a);
			}
		}
		System.out.println(sb);
	}

}
