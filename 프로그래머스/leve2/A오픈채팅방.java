package leve2;
import java.util.*;
public class A오픈채팅방 {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		Map<String, String> name = new HashMap<>();
		List<String> list = new ArrayList<>();
		List<String> tmp = new ArrayList<>();
		for(int i=0; i<record.length; i++) {
			String[] str = record[i].split(" ");
			if(!str[0].equals("Leave")) {
				name.put(str[1], str[2]);
			}
			
			if(str[0].equals("Enter")) {
				tmp.add(str[1]);
				list.add("님이 들어왔습니다.");
			}else if(str[0].equals("Leave")) {
				tmp.add(str[1]);
				list.add("님이 나갔습니다.");
			}
		}
		String[] ans = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = name.get(tmp.get(i))+list.get(i);
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
