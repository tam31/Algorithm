package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A09_1744 {
	static long ans=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==1) {
				ans +=1;
			}else if(num>0) {
				a.add(num);
			}else {
				b.add(num);
			}
		}
		
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder());
		
		
		seqsum(a);
		seqsum(b);
		System.out.println(ans);
			
	}

	private static void seqsum(List<Integer> v) {
		while(1<v.size()) {
			ans+= v.remove(v.size()-1)*v.remove(v.size()-1);
		}
		if(v.size()==1) {
			ans += v.remove(0);
		}
		
	}

}
