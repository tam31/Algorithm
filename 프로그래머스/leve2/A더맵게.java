package leve2;
import java.util.*;
public class A더맵게 {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int k = 7;
		
		PriorityQueue<Integer> list = new PriorityQueue<>();
		for(int i:scoville) {
			list.add(i);
		}
		int cnt = 0;
		while(list.size()>1 && list.peek()<k) {
			int a = list.poll();
			int b = list.poll()*2;
			cnt +=1;
			list.add(a+b);
		}
		
		if(list.peek()<k || list.size()==0) {
			cnt = -1;
		}
		System.out.println(cnt);
	}

}
