package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A18869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] list = new int[n][m];
		List<Integer>[] arr = new ArrayList[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			Set<Integer> set = new HashSet<>();
			for(int j=0; j<m; j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
				set.add(list[i][j]);
			}
			
			arr[i] = new ArrayList(set);
			Collections.sort(arr[i]);
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				list[i][j] = func(arr[i], list[i][j]);
			}
		}
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(Arrays.equals(list[i], list[j])) {
					ans +=1;
				}
			}
		}
		
		System.out.println(ans);
	}
	private static int func(List<Integer> list, int tmp) {
		int start = 0;
		int end = list.size()-1;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(list.get(mid)==tmp) {
				return mid;
			}
			
			if(list.get(mid)<tmp) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return 0;
	}
}
