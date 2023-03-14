package 일차3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {10};
	
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		Integer min = Collections.min(list);
		System.out.println(min);
		list.remove(min);
		if(list.size()==0) {
			list.add(-1);
		}
		
		int[] bb = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			bb[i] = list.get(i);
		}
	}

}
