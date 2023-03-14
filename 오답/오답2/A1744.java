package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class A1744 {
	static int ans = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 1) {
				ans +=1;
			}else if(num >0) {
				arr1.add(num);
			}else {
				arr2.add(num);
			}
		}
		
		
		Collections.sort(arr1, Collections.reverseOrder());
		Collections.sort(arr2);
		
		func(arr1);
		func(arr2);
		System.out.println(ans);
	}
	private static void func(ArrayList<Integer> arr) {
		while(arr.size()>1) {
			ans += arr.remove(0)*arr.remove(0);
			
		}
		if(arr.size()==1) {
			ans += arr.remove(0);
		}
	}

}
