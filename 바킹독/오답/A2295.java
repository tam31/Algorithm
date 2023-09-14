package 이분탐색.오답;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2295 {
	static int ans = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(list);
		List<Integer> list2 = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				list2.add(list[i]+list[j]);
			}
		}
		Collections.sort(list2);
		func(n,list, list2);
		System.out.println(ans);
	}
	private static void func(int n, int[] list, List<Integer> arr) {
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(func2(arr, (list[i]-list[j]))) {
					ans = list[i];
					return;
				}
			}
		}
	}
	private static boolean func2(List<Integer> list, int tmp) {
		int start = 0;
		int end = list.size();
		while(start<=end) {
			int mid = (start+end)/2;
			if(list.get(mid)==tmp) {
				return true;
			}
			if(list.get(mid)<tmp) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return false;
	}
}
