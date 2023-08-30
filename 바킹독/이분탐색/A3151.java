package 이분탐색;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A3151 {
	static int[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		//1. 정렬
		Arrays.sort(list);
		long ans = 0;
		//2. 3수의 합이 0인 수 찾기 x+y=-z
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				//3. 정답이 되는 처음 인덱스
				int start = lower(j+1, n, (list[i]+list[j])*-1);
				
				//4. 정답이 되는 마지막 인덱스
				int end = upper(j+1, n, (list[i]+list[j])*-1);
				
				//5. 마지막과 처음 인덱스의 합
				ans += (end-start);
			}
		}
		
		System.out.println(ans);
	}
	private static int lower(int start, int end, int tmp) {
		
		while(start<end) {
			int mid = (start+end)/2;
			
			if(list[mid]>=tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
	
private static int upper(int start, int end, int tmp) {
		
		while(start<end) {
			int mid = (start+end)/2;
			
			if(list[mid]>tmp) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
}
