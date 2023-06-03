package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			arr2[i] = a;
		}
		
		Arrays.sort(arr);
		int num = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], num);
				num+=1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(map.get(arr2[i])+" ");
		}
		System.out.println(sb);
	}

}
