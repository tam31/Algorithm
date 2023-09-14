package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class A2170 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int data[][] = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(data,(o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		int start = data[0][0];
		int end = data[0][1];
		int sum = end-start;
		for(int i=1; i<n; i++) {
			if(start<=data[i][0] && end >= data[i][1]) {
				continue;
			}else if(end >=data[i][0]) {
				sum += data[i][1]-end;
				end = data[i][1];
				
			}else {
				start = data[i][0];
				end = data[i][1];
				sum += end-start;
			}
		}
		System.out.println(sum);
		
	}
}
