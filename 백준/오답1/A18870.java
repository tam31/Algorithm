package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			a1[i] = a;
			a2[i] = a;
		}
		
		Arrays.sort(a1);
		Map<Integer, Integer> map = new HashMap<>();
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(!map.containsKey(a1[i])) {
				map.put(a1[i], cnt);
				cnt +=1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(map.get(a2[i])+" ");
		}
		
		System.out.println(sb);
	}

}
