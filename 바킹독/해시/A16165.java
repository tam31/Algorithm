package 해시;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A16165 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String,List<String>> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			String team = br.readLine();
			map1.put(team, new ArrayList<>());
			int k = Integer.parseInt(br.readLine());
			for(int j=0; j<k; j++) {
				String name = br.readLine();
				map1.get(team).add(name);
				map2.put(name, team);
			}
			Collections.sort(map1.get(team));
		}
		for(int i=0; i<m; i++) {
			String str = br.readLine();
			int num = Integer.parseInt(br.readLine());
			if(num==1) {
				System.out.println(map2.get(str));
			}else {
				List<String> arr = map1.get(str);
				for(String tmp: arr) {
					System.out.println(tmp);
				}
			}
		}
	}

}
