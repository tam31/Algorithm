package 해시.오답;
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
			String str=br.readLine();
			map.put(str, i);
		}
		
		List<String> list = new ArrayList<>();
		for(String str: map.keySet()) {
			list.add(str);
		}
		
		Collections.sort(list,(o1,o2)->{
			return map.get(o1)-map.get(o2);
		});
		
		for(int i=0; i<list.size(); i++) {
			if(i==n) {
				break;
			}
			System.out.println(list.get(i));
		}
	}

}
