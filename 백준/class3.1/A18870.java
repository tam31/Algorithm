package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] list1 = new int[n];
		int[] list2 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			list1[i] = a;
			list2[i] = a;
		}
		
		Arrays.sort(list1);
		int num = 0;
		for(int i=0; i<n; i++) {
			int a = list1[i];
			if(!map.containsKey(a)) {
				map.put(a, num);
				num +=1;
			}
		}
		
		for(int i=0; i<n; i++) {
			int a = list2[i];
			sb.append(map.get(a)+" ");
		}
		System.out.println(sb);
	}

}
