package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A9375 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		for(int num=0; num<nums; num++) {
			int n = Integer.parseInt(br.readLine());
			
			Map<String, Integer> map = new HashMap<>();
			for(int i=0; i<n; i++) {
				String[] str = br.readLine().split(" ");
				map.put(str[1], map.getOrDefault(str[1], 0)+1);
			}
			
			int cnt = 1;
			for(String a : map.keySet()) {
				cnt *= (map.get(a)+1);
			}
			
			System.out.println(cnt-1);
		}
	}

}
