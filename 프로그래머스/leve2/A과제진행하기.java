package leve2;
import java.util.*;
public class A과제진행하기 {

	public static void main(String[] args) {
		String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
	
		int n = plans.length;
		String[] ans = new String[n];
		Stack<String[]> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			String[] str = plans[i][1].split(":");
			int time = Integer.parseInt(str[0])*60+Integer.parseInt(str[1]);
			plans[i][1] = String.valueOf(time);
		}
		Arrays.sort(plans, (o1,o2)->{
			int a = Integer.parseInt(o1[1]);
			int b = Integer.parseInt(o2[1]);
			return a-b;
			
		});
		
//		for(int i=0; i<n; i++) {
//			System.out.println(Arrays.deepToString(plans[i]));
//		}
		int start = Integer.parseInt(plans[0][1]);
		stack.add(new String[] {plans[0][0],plans[0][2]});
		int k = 0;
		for(int i=1; i<n; i++) {
			String[] str = plans[i];
			while(!stack.isEmpty()) {
				String[] tmp = stack.peek();
				int one = Integer.parseInt(tmp[1]);
				int two = Integer.parseInt(str[1]);
				if(one+start > two) {
					int re = two - start;
					one = one+start -two;
					stack.pop();
					stack.add(new String[] {tmp[0],String.valueOf(one)});
					start = two;
					break;
				}else {
					stack.pop();
					ans[k] = tmp[0];
					k++;
					start = one+start;
				}
			}
			start = Integer.parseInt(str[1]);
			stack.add(new String[] {str[0],str[2]});
			
		}
		while(!stack.isEmpty()) {
			ans[k] = stack.pop()[0];
			k++;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
