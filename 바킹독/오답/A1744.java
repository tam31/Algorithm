package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A1744 {
	static int ans = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 1) {
				ans +=1;
			}else if(num >0) {
				a.add(num);
			}else {
				b.add(num);
			}
		}
		
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder());
		
		func(a);
		func(b);
		System.out.println(ans);
	}
	private static void func(List<Integer> a) {
		while(a.size()>1) {
			ans += (a.remove(a.size()-1)*a.remove(a.size()-1));
		}
		if(a.size()==1) {
			ans += a.remove(0);
		}
	}

}
