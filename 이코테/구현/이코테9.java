package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이코테9 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		
		int count = s.length();
		for(int i=1; i<s.length()/2+1; i++) {
			String a = s.substring(0, i);
//			System.out.println(a);
			String ans = "";
			int cnt = 1;
			for(int j=i; j<s.length(); j+=i) {
				int endIdx = Math.min(j+i, s.length());
//				System.out.println(str.substring(j, endIdx));
				String check = s.substring(j, endIdx);
				if(a.equals(check)) {
					cnt +=1;
				}else {
					if(cnt == 1) {
						ans += a;
					}else {
						ans += cnt + a;
					}
					a = s.substring(j,endIdx);
					cnt = 1;
				}
			}
			ans += (cnt == 1) ? a: cnt+a;
//			System.out.println(ans);
			count = Math.min(count, ans.length());
		}
		
		System.out.println(count);
	}

}
