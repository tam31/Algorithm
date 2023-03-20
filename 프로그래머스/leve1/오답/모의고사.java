package 오답1;

import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int[] cnt = new int[3];
		for(int i=0; i<answers.length; i++) {
			if(a[i%5]==answers[i]) {
				cnt[0] +=1;
			}
			if(b[i%8]==answers[i]) {
				cnt[1] +=1;
			}
			if(c[i%10]==answers[i]) {
				cnt[2]+=1;
			}
		}
		
		int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
		int count = 0;
		for(int i=0; i<3; i++) {
			if(max == cnt[i]) {
				count +=1;
			}
		}
		
		int ans[] = new int[count];
		int j = 0;
		for(int i=0; i<3; i++) {
			if(max == cnt[i]) {
				ans[j] = i+1;
				j+=1;
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
