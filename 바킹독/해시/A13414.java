package 해시;
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
			String number = br.readLine();
			map.put(number, i);
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		list.sort((o1,o2)->{
			return map.get(o1)-map.get(o2);
		});
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			if(i>=n) break;
			sb.append(list.get(i)+"\n");
		}
		System.out.println(sb);
	}
}
