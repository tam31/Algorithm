package 오답1;
import java.util.*;
public class A튜플 {

	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		s = s.substring(2,s.length()-2);
		s = s.replace("},{", "-");
		String[] str = s.split("-");
		Arrays.sort(str, (o1,o2)->{
			return o1.length()-o2.length();
		});
		List<Integer> list = new ArrayList<>();
		for(String tmp:str) {
			String[] a = tmp.split(",");
			for(String b : a) {
				int c = Integer.parseInt(b);
				if(!list.contains(c)) {
					list.add(c);
				}
			}
		}
		
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
