package 오답2;
import java.util.*;
public class 타켓넘버 {

	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target = 4;
		
		int n = numbers.length;
		int cnt = 0;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {numbers[0],0});
		que.add(new int[] {-numbers[0],0});
		
		while(!que.isEmpty()) {
			int[] data = que.poll();
			if(data[1] == n-1) {
				if(target == data[0]) {
					cnt +=1;
				}
			}else {
				que.add(new int[] {data[0]+numbers[data[1]+1], data[1]+1});
				que.add(new int[] {data[0]-numbers[data[1]+1], data[1]+1});
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
