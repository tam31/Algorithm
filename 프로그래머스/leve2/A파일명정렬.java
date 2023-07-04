package leve2;
import java.util.*;
public class A파일명정렬 {

	public static void main(String[] args) {
		String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		
		List<String[]> list = new ArrayList<>();
		for(int i=0; i<files.length; i++) {
			String str = files[i].toLowerCase();
			String tmp = "";
			String num ="";
			String[] re = new String[3];
			boolean a = false;
			for(int j=0; j<str.length(); j++) {
				if(!a && !(str.charAt(j)>='0' && str.charAt(j)<='9')) {
					tmp+=str.charAt(j);
				}
				
				if(str.charAt(j)>='0'&& str.charAt(j)<='9') {
					num += str.charAt(j);
					a = true;
				}
				
				if(a && !(str.charAt(j)>='0' && str.charAt(j)<='9')) {
					break;
				}
			}
			re[0]=tmp;
			re[1]=num;
			re[2]=String.valueOf(i);
			list.add(re);
		}
		
		
		
		Collections.sort(list, (o1,o2)->{
			if(o1[0].equals(o2[0])) {
				int a = Integer.parseInt(o1[1]);
				int b = Integer.parseInt(o2[1]);
				if(a==b) {
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
				}
				return a-b;
			}
			return o1[0].compareTo(o2[0]);
		});
		

		
		String[] ans = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			int num = Integer.parseInt(list.get(i)[2]);
			ans[i] = files[num];
		}
		System.out.println(Arrays.toString(ans));
	}

}
