package 이분탐색.오답2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2295 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		List<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				arr.add((list[i]+list[j]));
			}
		}
		
		Collections.sort(arr);
		
		int ans = maxNumber(list, arr);
		System.out.println(ans);
	}
	private static int maxNumber(int[] list, List<Integer> arr) {
		for(int i=list.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				int tmp = list[i]-list[j];
				if(checkNumber(arr,tmp)) {
					return list[i];
				}
			}
		}
		return 0;
	}
	
	private static boolean checkNumber(List<Integer> arr,int tmp) {
		int start = 0;
		int end = arr.size()-1;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr.get(mid)==tmp) {
				return true;
			}
			
			if(arr.get(mid)>tmp) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return false;
	}

}
