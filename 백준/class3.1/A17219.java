package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A17219 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			sb.append(map.get(br.readLine())+"\n");
		}
		
		System.out.println(sb);
	}

}
