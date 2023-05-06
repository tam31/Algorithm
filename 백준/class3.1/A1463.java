package class3;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {n,0});
		while(!que.isEmpty()) {
			int[] a = que.poll();
			
			if(a[0]==1) {
				cnt = a[1];
				break;
			}
			
			if(a[0]%3==0) {
				que.add(new int[] {a[0]/3,a[1]+1});
			}
			if(a[0]%2==0) {
				que.add(new int[] {a[0]/2,a[1]+1});
			}
			if(a[0]-1>0) {
				que.add(new int[] {a[0]-1,a[1]+1});
			}
		}
		System.out.println(cnt);
	}

}
