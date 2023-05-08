package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		for(int i=0; i<n; i++) {
			String tmp = br.readLine(); 
			map1.put(tmp, i);
			map2.put(i, tmp);
		}
		
		for(int i=0; i<m; i++) {
			String a = br.readLine();
			if(map1.get(a) != null) {
				sb.append((map1.get(a)+1) +"\n");
			}else {
				sb.append(map2.get(Integer.parseInt(a)-1)+"\n");
			}
		}
		System.out.println(sb);
	}

}
