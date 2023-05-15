package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<>((o1,o2)->{ 
			if(Math.abs(o1)==Math.abs(o2)) {
				return o1-o2;
			}
			return Math.abs(o1)-Math.abs(o2);
		});
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a!=0) {
				que.add(a);
			}else {
				if(!que.isEmpty()) {
					sb.append(que.poll()+"\n");
				}else {
					sb.append(0+"\n");
				}
			}
		}
		System.out.println(sb);
	}

}
