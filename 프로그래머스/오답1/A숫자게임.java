package 오답1;
import java.util.*;
public class A숫자게임 {

	public static void main(String[] args) {
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		
		int n = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		
		int cnt = 0;
		int j =0;
		for(int i=0; i<n; i++) {
			while(j<n) {
				if(A[i]<B[j]) {
					cnt+=1;
					j++;
					break;
				}
				j++;
			}
		}
		System.out.println(cnt);
	}

}
