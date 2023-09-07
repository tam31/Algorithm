package leve3;
import java.util.*;
public class A숫자게임 {

	public static void main(String[] args) {
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		
		int n = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		
		int ans = 0;
		int idx = 0;
		for(int i=0; i<n; i++) {
			while(idx<n) {
				if(B[idx]>A[i]) {
					idx+=1;
					ans+=1;
					break;
				}else {
					idx+=1;
				}
			}
		}
		System.out.println(ans);
	}

}
