package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class A1092 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//컨테이너
		int n = Integer.parseInt(br.readLine());
		//배열넣기
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		//박스
		int m = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> box = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		//내림차순으로정렬
		Collections.sort(arr, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		
		
		//
		if(arr.get(0)<box.get(0)) {
			System.out.println(-1);
		}else {
			int cnt = 0;
			while(!box.isEmpty()) {
				int idx = 0;
				for(int i=0; i<n;) {
					if(idx == box.size()) {
						break;
					}
					else if(arr.get(i) >= box.get(idx)) {
						i++;
						box.remove(idx);
					}else {
						idx +=1;
					}
				}
				cnt +=1;
			}
			System.out.println(cnt);
			
			
		}
		
	}

}
