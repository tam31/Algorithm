package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1697 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[100001];
		arr[n] = 1;
		Queue<Integer> que = new LinkedList<>();
		que.add(n);
		while(!que.isEmpty() && arr[m] == 0) {
			int a = que.poll();
			if(a-1>=0 && arr[a-1]==0) {
				arr[a-1] = arr[a]+1;
				que.add(a-1);
			}
			if(a+1<=100000 && arr[a+1]==0) {
				arr[a+1]=arr[a]+1;
				que.add(a+1);
			}
			if(a*2 <= 100000 && arr[a*2]==0) {
				arr[a*2] = arr[a]+1;
				que.add(a*2);
			}
			
		}
		System.out.println(arr[m]-1);
	}

}
