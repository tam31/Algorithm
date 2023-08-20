package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] list = new int[n];
		int[] list2 = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			list2[i] = list[i];
		}
		
		Arrays.sort(list2);
		List<Integer> arr = new ArrayList<>();
		arr.add(list2[0]);
		for(int i=1; i<n; i++) {
			if(list2[i-1]!=list2[i]) {
				arr.add(list2[i]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int tmp = list[i];
			
			int start = 0;
			int end = arr.size()-1;
			while(start<=end) {
				int mid = (start+end)/2;
				if(arr.get(mid)==tmp) {
					sb.append(mid+" ");
					break;
				}
				if(arr.get(mid) < tmp) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		
		System.out.println(sb);
	}

}
