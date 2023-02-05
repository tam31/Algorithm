package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A1092 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> a = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> box = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(a, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		
		if(a.get(0) < box.get(0)) {
			System.out.println(-1);
		}else {
			int cnt = 0;
			while(box.size() !=0) {
				int count = 0;
				for(int i=0; i<n;) {
					if(count == box.size()) {
						break;
					}
					else if(box.get(count) <= a.get(i)) {
						box.remove(0);
						i++;
					}else {
						count +=1;
					}
					
					
				}
				cnt +=1;
				
			}
			System.out.println(cnt);
		}
		
		
	}

}
