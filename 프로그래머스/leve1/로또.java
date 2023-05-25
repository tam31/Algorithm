package level1;
import java.util.*;
public class 로또 {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<win_nums.length; i++) {
			list.add(win_nums[i]);
		}
		
		int cnt=7;
		int count = 0;
		for(int i=0; i<6; i++) {
			int num = lottos[i];
			if(list.contains(num)) {
				cnt-=1;
			}
			
			if(num==0) {
				count +=1;
			}
		}
		
		int[] ans = new int[2];
		if(cnt==7) {
			ans[1] = 6;
		}else {
			ans[1] = cnt;
		}
		
		if(cnt-count<=0) {
			ans[0] = 1;
		}else if(cnt-count >=6) {
			ans[0]=6;
		}else {
			ans[0]=cnt-count;
		}
		System.out.println(Arrays.toString(ans));
	}

}
