package leve2;
import java.util.*;
public class A호텔대실 {

	public static void main(String[] args) {
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
	
		int[][] list = new int[book_time.length][2];
		for(int i=0; i<book_time.length; i++) {
			String[] str1 = book_time[i][0].split(":");
			String[] str2 = book_time[i][1].split(":");
			
			int start = Integer.valueOf(str1[0])*60+Integer.valueOf(str1[1]);
			int end = Integer.valueOf(str2[0])*60+Integer.valueOf(str2[1]);
			
			list[i][0] = start;
			list[i][1] = end;
		}
		
		Arrays.sort(list, (o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
//		System.out.println(Arrays.deepToString(list));
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		for(int i=0; i<list.length; i++) {
			
			int start = list[i][0];
			int end = list[i][1];
		
			if(que.isEmpty()) {
				que.add(end+10);
			}else {
				if(que.peek()<=start) {
					que.poll();
				}
				que.add(end+10);
			}
//			System.out.println(que);
		}
		
		System.out.println(que);
	}

}
