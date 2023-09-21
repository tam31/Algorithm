package 오답2;
import java.util.*;
public class A숫자게임 {

	public static void main(String[] args) {
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int n = A.length;
		int idx = 0;
		int ans = 0;
		for(int i=0; i<n; i++) {
			while(idx<n) {
				if(B[idx]> A[i]) {
					ans+=1;
					idx++;
					break;
				}
				idx++;
			}
		}
		System.out.println(ans);
	}

}
