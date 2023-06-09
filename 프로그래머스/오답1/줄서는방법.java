package leve2;

import java.util.ArrayList;

public class 줄서는방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int k =5;
		
		int[] ans = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		long f = 1;
		for(int i=1; i<=n; i++) {
			f *=i;
			list.add(i);
		}
		
		k -=1;
		int idx = 0;
		while(idx<n) {
			f = f/(n-idx);
			ans[idx++] = list.remove((int)(k/f));
			k %= f;
		}
		
	}

}
