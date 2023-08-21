package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1822 {
	static List<Integer> re = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] listA = new int[n];
		for(int i=0; i<n; i++) {
			listA[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] listB = new int[m];
		for(int i=0; i<m; i++) {
			listB[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(listB);
		for(int i=0; i<n; i++) {
			int tmp = listA[i];
			if(func(listB, tmp)) {
				re.add(tmp);
			}
		}
		Collections.sort(re);
		if(re.size()==0) {
			System.out.println(0);
		}else {
			StringBuilder sb = new StringBuilder();
			sb.append(re.size()+"\n");
			for(int i=0; i<re.size(); i++) {
				sb.append(re.get(i)+" ");
			}
			System.out.println(sb);
		}
	}
	private static boolean func(int[] list, int tmp) {
		int start = 0;
		int end = list.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(list[mid]==tmp) return false;
			if(list[mid]<tmp) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return true;
	}
}
