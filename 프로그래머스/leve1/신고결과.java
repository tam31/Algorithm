package level1;
import java.util.*;
public class 신고결과 {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		List<String> list = new ArrayList<>();
		for(int i=0; i<report.length; i++) {
			if(!list.contains(report[i])) {
				list.add(report[i]);
			}
		}
		
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<id_list.length; i++) {
			map.put(id_list[i], 0);
		}
		
		for(int i=0; i<list.size(); i++) {
			String[] str = list.get(i).split(" ");
			map.put(str[1], map.get(str[1])+1);
		}
		
		List<String> re = new ArrayList<>();
		for(String s: map.keySet()) {
			if(map.get(s)>=k) {
				re.add(s);
			}
		}
		
		System.out.println(re);
		
		int[] ans = new int[id_list.length];
		
		for(int i=0; i<list.size(); i++) {
			String[] str = list.get(i).split(" ");
			if(re.contains(str[1])) {
				for(int j=0; j<id_list.length; j++) {
					if(id_list[j].equals(str[0])) {
						ans[j] +=1;
					}
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
