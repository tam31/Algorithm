package 오답2;
import java.util.*;
public class A튜플 {

	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		List<String> list = new ArrayList<>();
		s = s.substring(2,s.length()-2);
		s = s.replace("},{", "#");
		String[] tmp = s.split("#");
//		System.out.println(s);
		
		Arrays.sort(tmp,(o1,o2)->{
			return o1.length()-o2.length();
		});
		System.out.println(Arrays.toString(tmp));
		for(int i=0; i<tmp.length; i++) {
			String[] str = tmp[i].split(",");
			for(int j=0; j<str.length; j++) {
				if(!list.contains(str[j])) {
					list.add(str[j]);
				}
			}
		}
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = Integer.valueOf(list.get(i));
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
