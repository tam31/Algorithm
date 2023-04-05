package 오답1;
import java.util.*;
public class 타켓넘버 {

	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target = 4;
		
		int n = numbers.length;
		int cnt = 0;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {numbers[0],1});
		que.add(new int[] {numbers[0]*-1,1});
		
		while(!que.isEmpty()) {
			int data[] = que.poll();
			//System.out.printf("%d %d\n",data[0],data[1]);
			if(data[1]==n) {
				if(data[0]==target) {
					cnt+=1;
				}
				continue;
			}
			
			if(data[1] <n) {
				que.add(new int[] {data[0]+numbers[data[1]],data[1]+1});
				que.add(new int[] {data[0]-numbers[data[1]],data[1]+1});
			}
		}
		System.out.println(cnt);
		
		
	}

}
