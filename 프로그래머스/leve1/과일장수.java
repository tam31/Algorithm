package 일차7;

import java.util.Arrays;
import java.util.*;

public class 과일장수 {

	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		
		Arrays.sort(score);
		int n = score.length%m;
		int cnt = 0;
		for(int i=n; i<score.length; i+=m) {
			cnt += score[i]*m;
		}
		System.out.println(cnt);

	}

}
