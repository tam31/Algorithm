package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[10];
		if(m!=0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++) {
				arr[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int ans = Math.abs(n-100);
		
		for(int i=0; i<=999999; i++) {
			String tmp = String.valueOf(i);
			int len = tmp.length();
			
			boolean check = true;
			for(int j=0; j<len; j++) {
				int num = tmp.charAt(j)-'0';
				if(arr[num]) {
					check= false;
					break;
				}
			}
			
			if(check) {
				int cnt = Math.abs(n-i)+len;
				ans = Math.min(ans, cnt);
			}
		}
		System.out.println(ans);
	}

}
