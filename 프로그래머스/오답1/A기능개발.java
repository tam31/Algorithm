package leve2;
import java.util.*;
public class A기능개발 {

	public static void main(String[] args) {
		int[] progresses = {90, 90, 90, 90};
		int[] speeds = {30, 1, 1, 1};
		
		int[] re = new int[speeds.length];
		for(int i=0; i<speeds.length; i++) {
			int tmp = (100-progresses[i])/speeds[i];
			if((100-progresses[i]) % speeds[i] !=0) {
				tmp+=1;
			}
			
			re[i] = tmp;
		}
		
		List<Integer> list = new ArrayList<>();
		int num = re[0];
		int cnt = 1;
		for(int i=1; i<re.length; i++) {
			if(num>=re[i]) {
				cnt+=1;
			}else {
				list.add(cnt);
				cnt=1;
				num=re[i];
			}
		}
		list.add(cnt);
		
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		System.out.println(Arrays.toString(ans));
	}

}
