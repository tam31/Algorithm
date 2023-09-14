package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int cnt = 1;
		while(true) {
			if(k%2==0) {
				k /=2;
				cnt +=1;
			}else {
				if(k % 10 != 1) {
					cnt =-1;
					break;
				}else {
					cnt +=1;
					k = k/10;
				}
			}
			if(k==n) {
				break;
			}else if(k<n) {
				cnt =-1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
