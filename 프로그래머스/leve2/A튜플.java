package leve2;
import java.util.*;
public class A튜플 {

	public static void main(String[] args) {
		String s= "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		
		List<Integer> list = new ArrayList<>();
		
		s = s.substring(2,s.length()-2);
		s = s.replace("},{", "-");
		String[] str = s.split("-");
		Arrays.sort(str, (o1,o2)->{
			return o1.length()-o2.length();
		});
		
		for(String x: str) {
			String[] tmp = x.split(",");
			for(int i=0; i<tmp.length; i++) {
				int a = Integer.parseInt(tmp[i]);
				if(!list.contains(a)) {
					list.add(a);
				}
			}
		}
		
		int[] ans = new int[list.size()];
		for(int i = 0 ; i<list.size(); i++) {
			ans[i]=list.get(i);
		}
		
		System.out.println(list);
	}

}
