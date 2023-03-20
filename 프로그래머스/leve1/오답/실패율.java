package 오답1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 실패율 {

	public static void main(String[] args) {
		
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int N = 5;
		
		Arrays.sort(stages);
		int[] count = new int[N];
		int[] idx = new int[N];
		ArrayList<Double> data1 = new ArrayList<>();
		ArrayList<Double> data2 = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			count[stages[i]-1] +=1;
		}
		int n = N;
		for(int i=0; i<N; i++) {
			data1.add((double)count[i]/n);
			data2.add(data1.get(i));
			n-=count[i];
		}
		
		Collections.sort(data1, Collections.reverseOrder());
		System.out.println(data1);
		
		int[] ans = new int[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(data1.get(i) == data2.get(j)) {
					data2.remove(j);
					ans[i] = j;
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
		
		
	}

}
