package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A7453 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		long[] d = new long[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i] = Long.parseLong(st.nextToken());
			b[i] = Long.parseLong(st.nextToken());
			c[i] = Long.parseLong(st.nextToken());
			d[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		Arrays.sort(d);
		
		List<Long> list1 = new ArrayList<>();
		List<Long> list2 = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				list1.add(a[i]+b[j]);
				list2.add(c[i]+d[j]);
			}
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		long ans = 0;
		for(int i=0; i<list1.size(); i++) {
			int start = lower(list2, list1.get(i)*-1);
			int end = upper(list2, list1.get(i)*-1);
			ans += end-start;
		}
		System.out.println(ans);
	}
	private static int lower(List<Long> list, long tmp) {
		int start = 0;
		int end = list.size();
		while(start<end) {
			int mid = (start+end)/2;
			
			if(list.get(mid)>=tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
	
	private static int upper(List<Long> list, long tmp) {
		int start = 0;
		int end = list.size();
		while(start<end) {
			int mid = (start+end)/2;
			
			if(list.get(mid)>tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
}
