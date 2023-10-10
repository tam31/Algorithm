package 해시.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A13414 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<m; i++) {
			String tmp = br.readLine();
			if(map.containsKey(tmp)) {
				map.remove(tmp);
			}
			
			map.put(tmp, i);
		}
		
		List<String> list = new ArrayList<>();
		for(String tmp: map.keySet()) {
			list.add(tmp);
		}
		
		Collections.sort(list,(o1,o2)->{
			return map.get(o1)-map.get(o2);
		});
		
		for(int i=0; i<list.size(); i++) {
			if(i>=n) {
				break;
			}
			System.out.println(list.get(i));
		}
		
	}

}
