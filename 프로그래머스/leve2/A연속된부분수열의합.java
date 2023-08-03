package leve2;
import java.util.*;
public class A연속된부분수열의합 {
	
	public static void main(String[] args) {
		int[] sequence = {2, 2, 2, 2, 2};
		int k = 6;
		
		List<int[]> list = new ArrayList<>();
		Queue<Integer> que = new LinkedList<>();
		int start = 0;
		int sum = 0;
		for(int i=0; i<sequence.length; i++) {
			int num = sequence[i];
			sum += num;
			que.add(num);
			
			while(sum >=k) {
				if(sum==k) {
//					System.out.println(start+" "+i);
					list.add(new int[] {start,i});
				}
				int sub = que.poll();
				sum -= sub;
				start +=1;
//				System.out.println(sum+"-"+sub+" "+start);
			}
		}
		
		
		Collections.sort(list, (o1,o2)->{
			int tmp1 = o1[1]-o1[0];
			int tmp2 = o2[1]-o2[0];
			if(tmp1==tmp2) {
				return o1[0]-o2[0];
			}
			return tmp1 - tmp2;
		});
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(Arrays.toString(list.get(i)));
//		}
		int[] ans = new int[2];
		ans[0] = list.get(0)[0];
		ans[1] = list.get(0)[1];
		System.out.println(Arrays.toString(list.get(0)));
	}

}
