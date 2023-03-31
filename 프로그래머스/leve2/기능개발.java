package leve2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		ArrayList<Integer> list = new ArrayList<>();
		int[] data = new int[speeds.length];
		for(int i=0; i<progresses.length; i++) {
			int a = 100 - progresses[i];
			data[i] = (int)Math.ceil(1.0*a/speeds[i]);
		}
		
		System.out.println(Arrays.toString(data));
		Queue<Integer> que = new LinkedList<>();
		int cnt = 0;
		for(int i=0; i<data.length; i++) {
			if(que.isEmpty()) {
				que.add(data[i]);
				cnt +=1;
			}else {
				if(que.peek()>=data[i]) {
					cnt +=1;
				}
				else {
					que.poll();
					que.add(data[i]);
					list.add(cnt);
					cnt =1;
				}
			}
			if(i == data.length-1) {
				list.add(cnt);
			}
		}
		System.out.println(list);
		
	}

}
